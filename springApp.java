package org.springss;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class springApp  {
    public static void main(String[] args) {
        System.out.println("steams api");
        List<Integer> l1=new ArrayList<>();
      l1.add(7); l1.add(4); l1.add(8);l1.add(5);
        System.out.println(l1);
       List l2=List.of(5,3,2,5,7,8,9);
       Stream<Integer> s=l1.stream();
       List nl=s.filter(i->(i%2==1)).collect(Collectors.toList());
       //List nl1=s.map(i->i+1).collect(Collectors.toList());
        System.out.println(nl);
        System.out.println();
        System.out.println(l1.stream().reduce(0,(a,b)->a+b));
      List l=List.of(99,44,22,77,23,45,38,92,15,17);
      Stream<Integer> s1=l.stream();
     // List n=s1.sorted((x,y)->y-x).collect(Collectors.toList());
    //  List n=s1.sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        Map<String,Integer> persons=new HashMap<>();
      persons.put("baseeth",25);
      persons.put("salma",23);
        persons.put("badulla",20);
        persons.put("kb",45);
        System.out.println(persons);
      persons.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
      List<String> names=new ArrayList<>();
      names.add("Baseeth Shaik ");names.add("Shabina Shaik");
      names.add("Salma ");
      names.stream().filter(n->n.endsWith(" ")).forEach(System.out::println);
      List<Integer> num=new ArrayList<>();

      num.add(0);num.add(9);num.add(7);num.add(4);
      List<StudentForSpringApi> students=new ArrayList<>();
    students.add(new StudentForSpringApi("Baseeth",89));
        students.add(new StudentForSpringApi("rafi",23));
        students.add(new StudentForSpringApi("kaashif",76));
        students.add(new StudentForSpringApi("nobitha",55));
        students.add(new StudentForSpringApi("jithin",79));
        students.add(new StudentForSpringApi("prema",90));
        students.stream().sorted(Comparator.comparing(StudentForSpringApi::getMarks).reversed()).forEach(System.out::println);
        persons = new HashMap<>();
        persons.put("Baseeth",396000);
        persons.put("Obulesh",650000);
        persons.put("GouseBasha",200000);
       for(Map.Entry entry:persons.entrySet()){
           System.out.println(entry.getKey()+" maps to "+ entry.getValue());
       }
      persons.entrySet().stream().sorted((e1,e2)->e2.getValue()-e1.getValue()).forEach(System.out::println);
       List<Integer> rd=new ArrayList<>();
       rd.add(77);
       rd.add(33);
       rd.add(5);
       rd.add(55);
       int red=rd.stream().reduce(0,((e1,e2)->e1+e2));
        System.out.println(red);
        for(StudentForSpringApi std:students){
            System.out.println(std.getName() + "=" + std.getMarks());
        }
        rd=students.stream().map(e1->e1.getMarks()+1).collect(Collectors.toList());
        System.out.println(rd);
        for(StudentForSpringApi std:students) System.out.println(std.getName()+"="+ std.getMarks());







    }
}
