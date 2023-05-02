package notebooks;

import java.util.*;


public class Operations {
//    public Map<String, String> descriptionsProperties() {
//        Map<String, String> map = new HashMap<>();
//
//        map.put("brand", "Наименование");
//        map.put("RAM", "Объем оперативной памяти");
//        map.put("operatingSystem", "Операционная система");
//        map.put("price", "цена");
//        map.put("model", "модель");
//        map.put("batteryPower", "время автономной работы");
//        return map;
//    }
//    public List<String> editFilter(){
//        List<String> list = new ArrayList<>();
//        list.add("brand");
//        list.add("amountRAM");
//        list.add("operatingSystem");
//        list.add("price");
//        list.add("model");
//        list.add("batteryPower");
//
//
//        return list;
//    }

        public static void filterChoice(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - фильтрация по операционной системе");
            System.out.println("2 - фильтрация по цене");
            System.out.println("3 - фильтрация по оперативной памяти");
            System.out.println("4 - фильтрация по времени автономной работы");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Вы выбрали фильтрацию по операционной системе");
                    System.out.println("Введите цифру, которой соответствует предпочитаемая ОС:\n 1 - Mac OS\n 2 - Windows 10\n 3 - Windows 11\n 4 - Without OS");
                    int var1 = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Вы выбрали фильтрацию по цене");
                    System.out.println("Мы можем отфильтровать для вас ноутбука по возрастанию цены: ");

                    break;
                case 3:
                    System.out.println("Вы выбрали фильтрацию по оперативной памяти \n Введите предпочитаемое количестко оперативной памяти - 8 или 16");
                    int var2 = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Вы выбрали фильтрацию по времени автономной работы\n Введите предпочитаемое минимально количество часов работы в автономном режиме от 0 до 18");
                    int var3 = sc.nextInt();
                    break;
                default:
                    System.out.println("Введите цифру от 1 до 4");
                    break;
            }
        }
}
