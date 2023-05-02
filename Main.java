package notebooks;

import java.util.HashSet;
import java.util.Set;


//Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы.Реализовать в Java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map. Например:
//“Введите цифру, соответствующую необходимому критерию:
//
//1 - ОЗУ
//2 - Объём ЖД
//3 - Операционная система
//4 - Цвет …
//
//        Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры
//        фильтрации можно также в Map.
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class Main {
    public static void main(String[] args) {
//        Set<Notebooks> set = new HashSet<>();
//        set.add(new Notebooks("Samsung", "Galaxy Book2 360", "Windows 11 Home", 16, 139990,18));
//        set.add(new Notebooks("Acer", "Swift 3 (2021)", "Windows 10", 16,81990, 7));
//        set.add(new Notebooks("Dell", "XPS 13 (2022)","Windows 10 Home", 8,64995, 5 ));
//        set.add(new Notebooks("Lenovo","IdeaPad 5 15", "without OS", 16, 71115,9));
//        set.add(new Notebooks("Apple","MacBook Air 13 2022","Mac OS", 16, 157185, 16));

        Notebooks notebook1 = new Notebooks("Samsung", "Galaxy Book2 360", "Windows 11", 16, 139990,18);
        Notebooks notebook2 = new Notebooks("Acer", "Swift 3 (2021)", "Windows 10", 16,81990, 7);
        Notebooks notebook3 = new Notebooks("Dell", "XPS 13 (2022)","Windows 10", 8,64995, 5 );
        Notebooks notebook4 = new Notebooks("Lenovo","IdeaPad 5 15", "without OS", 16, 71115,9);
        Notebooks notebook5 = new Notebooks("Apple","MacBook Air 13 2022","Mac OS", 16, 157185, 16);
      Operations op = new Operations();



    }

}
