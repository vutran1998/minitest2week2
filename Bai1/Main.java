package Bai1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new ProgrammingBook(111, "văn học", 100000, "văn cao", "tiếng việt", "Thơ tình"));
        list.add(new ProgrammingBook(112, " học", 80000, "văn cao", "tiếng việt", "Thơ tình"));
        list.add(new ProgrammingBook(113, "văn học", 60000, "văn cao", "tiếng việt", "Thơ tình"));
        list.add(new ProgrammingBook(114, "văn học", 120000, "văn cao", "tiếng việt", "Thơ tình"));
        list.add(new ProgrammingBook(115, "văn học", 130000, "văn cao", "tiếng việt", "Thơ tình"));
        list.add(new FictionBook(116, "Starwar1", 300000, "vu", "Viễn tưởng1"));
        list.add(new FictionBook(117, "Starwar2", 400000, "vu", "Viễn tưởng2"));
        list.add(new FictionBook(118, "Starwar3", 500000, "vu", "Viễn tưởng1"));
        list.add(new FictionBook(119, "Starwar4", 600000, "vu", "Viễn tưởng2"));
        list.add(new FictionBook(120, "Starwar5", 700000, "vu", "Viễn tưởng1"));

        int amount = 0;
        int count = 0;
        int number=0;
        for (int i = 0; i < list.size(); i++) {
            amount += list.get(i).getPrice();
        }
        System.out.println(amount);
        System.out.println("tổng tiền của 10 cuốn sách là"+amount);
        System.out.println("------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof FictionBook) {
                if (((FictionBook) list.get(i)).getCategory().equals("Viễn tưởng1")) {
                    count++;
                }
            }
        }
        System.out.println("số sách có category là " + "Viễn tưởng 1" + "" + count);
        System.out.println("--------------------------------");
        for (Book p:list) {
            if (p.getPrice()<90000){
                number++;
            }
        }
        System.out.println("số sách có giá bé hơn 90000"+ "là" + number);
    }
}
