import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class PanelCellPhone {
    Scanner scanner = new Scanner(System.in);
    LinkedHashMap<Integer,CellPhone> cellPhoneList = new LinkedHashMap<>();

    AtomicInteger cellPhoneID = new AtomicInteger();
    public void cellPhoneList(){
        for (Integer keyset: cellPhoneList.keySet()
        ) {
            System.out.println("Cep Telefonu Listesi\n " + cellPhoneList.get(keyset).print());

        }
    }
    public void cellPhone(){
        int selection;
        boolean statusCellPhone = true;
        while (statusCellPhone){
            System.out.println("Cep Telefonu Yönetim Paneli !");
            System.out.println("1-Ürün Ekle" +
                    "\n2-Ürün Sil" +
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
                    addCellPhone();
                    System.out.println("Ürün ekleme işlemi başırılı.");
                    break;
                case 2:
                    if(deleteCellPhone()){
                        System.out.println("Silme işlemi başarılı");
                        break;
                    }else {
                        System.out.println("Hatalı bir ID girdiniz. Silme işlemi gerçekleşmedi.");
                    }break;
                case 3:
                    cellPhoneList();
                    break;
                case 0:
                    statusCellPhone = false;
                    break;
                default:
                    break;
            }
        }

    }
    private void addCellPhone() {
        int id = cellPhoneID.incrementAndGet();
        scanner.nextLine();
        System.out.println("Adı: ");
        String name = scanner.nextLine();
        System.out.println("Fiyatı: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Marka Adı: ");
        String brandName = scanner.nextLine();
        System.out.println("Depolama Alanı: ");
        int memorySize = scanner.nextInt();
        System.out.println("Ekran Boyutu: ");
        double screenSize = scanner.nextDouble();
        System.out.println("Kamera Çözünürlüğü: ");
        int camera = scanner.nextInt();
        System.out.println("Pil: ");
        int battery = scanner.nextInt();
        System.out.println("Ram: ");
        int ram = scanner.nextInt();
        System.out.println("Renk: ");
        String color = scanner.next();
        System.out.println("Stok Miktarı: ");

        int stockQuantity = scanner.nextInt();
        cellPhoneList.put(id,new CellPhone(id,price,stockQuantity,name,brandName,ram,memorySize,screenSize,battery,camera,color));


    }
    private boolean deleteCellPhone(){
        System.out.println("Silmek İstediğiniz ürünün ID'sini giriniz: ");
        int oldSize = cellPhoneList.size();
        int id = scanner.nextInt();
        cellPhoneList.remove(id);
        int newSize = cellPhoneList.size();

        return newSize != oldSize;
    }
}
