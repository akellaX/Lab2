package com.example.anna.lab2;

import java.util.Comparator;

class studentcomp implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        if (o1.mark.equals(o2.mark)){
            int flag=o1.name.compareTo(o2.name);
            return flag;
        }
        else return o1.mark-o2.mark;
    }
}
class student
{
    public student(String name1,Integer mark1)
    {
        name=name1;
        mark=mark1;

    }
    public String name;
    public Integer mark;

    @Override
    public String toString() {
        return name+" "+mark;
    }
}