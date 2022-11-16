import java.util.*;
public class ManagementPanel {
    private boolean statusRun = true;
    Scanner scanner = new Scanner(System.in);
    PanelCellPhone panelCellPhone = new PanelCellPhone();
    PanelNotebook panelNotebook = new PanelNotebook();


    public void run(){
        int selection;
        while (statusRun){
            System.out.println("PatikaStore Yönetim Paneli !");
            System.out.println("1-Notebook İşlemleri" + "\n2-Cep Telefonu İşlemleri" + "\n3-Marka Listele" + "\n0-Çıkış Yap");
            selection = scanner.nextInt();
            System.out.println("Tercihiniz : " + selection);
            while (selection < 0 || selection > 3){
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                selection = scanner.nextInt();
            }
            switch (selection){
                case 1:
                    panelNotebook.notebook();
                    break;
                case 2:
                    panelCellPhone.cellPhone();
                    break;
                case 3:
                    brandNameList();
                    break;
                case 0:
                    statusRun = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void brandNameList(){
        List<String> brandList = new ArrayList<>();
        System.out.println("Markalarımız\n----------------------\n");
        for (Integer keyset: panelNotebook.notebookList.keySet()) {
            brandList.add(panelNotebook.notebookList.get(keyset).getBrandName());
        }
        for (Integer keyset: panelCellPhone.cellPhoneList.keySet()) {
            brandList.add(panelCellPhone.cellPhoneList.get(keyset).getBrandName());
        }
        Collections.sort(brandList);

        for (String brand:brandList) {
            System.out.println(brand);

        }

    }

}

