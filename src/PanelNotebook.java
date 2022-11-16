import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class PanelNotebook {

    LinkedHashMap<Integer,Notebook> notebookList= new LinkedHashMap<>();
    AtomicInteger notebookID = new AtomicInteger();
    Scanner scanner = new Scanner(System.in);

    public void notebookList(){
        for (Integer keyset: notebookList.keySet()
        ) {
            System.out.println("Notebook Listesi\n" + notebookList.get(keyset).print());
        }
    }

    public void notebook(){
        int selection;
        boolean statusNotebook = true;
        while (statusNotebook){
            System.out.println("Notebook Yönetim Paneli !");
            System.out.println("1-Ürün Ekle" +
                    "\n2-Ürün sil" +
                    "\n3-Ürünleri Listele" +
                    "\n0-Çıkış Yap");
            selection = scanner.nextInt();
            System.out.println("Tercihiniz : " + selection);
            while (selection < 0 || selection > 3){
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                selection = scanner.nextInt();
            }
            switch (selection){
                case 1:
                    addNotebook();
                    break;
                case 2:
                    if(deleteNotebook()){
                        System.out.println("Silme işlemi başarılı");
                        break;
                    }else {
                        System.out.println("Hatalı bir ID girdiniz. Silme işlemi gerçekleşmedi.");
                    }break;
                case 3:
                    notebookList();
                    break;
                case 0:
                    statusNotebook = false;
                    break;
                default:
                    break;
            }
        }

    }

    private void addNotebook() {
        int id = notebookID.incrementAndGet();
        scanner.nextLine();
        System.out.println("Adı: ");
        String name = scanner.nextLine();
        System.out.println("Fiyatı: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Marka Adı: ");
        String brandName = scanner.nextLine();
        System.out.println("Depolama Alanı");
        int memorySize = scanner.nextInt();
        System.out.println("Ekran Boyutu");
        double screenSize = scanner.nextDouble();
        System.out.println("Ram");
        int ram = scanner.nextInt();
        System.out.println("Stok Miktarı: ");
        int stockQuantity = scanner.nextInt();
        notebookList.put(id,new Notebook(id,price,stockQuantity,name,brandName,ram,memorySize,screenSize));

    }
    private boolean deleteNotebook(){
        System.out.println("Silmek İstediğiniz ürünün ID'sini giriniz: ");
        int oldSize = notebookList.size();
        int id = scanner.nextInt();
        notebookList.remove(id);
        int newSize = notebookList.size();

        return newSize != oldSize;
    }


}
