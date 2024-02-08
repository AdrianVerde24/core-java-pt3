package org.example.task.tsk1;


public class Main {
    public static void main(String[] args) {
        System.out.println(StreamPrnt.rtnStreamval());
        //System.out.println(RandomNumberGenerator.geneRator());
        for (int i = 0; i < RandomNumberGenerator.geneRator().size(); i++) {
            System.out.println(RandomNumberGenerator.geneRator().get(i));
        }
        System.out.println(ListConvert.streamToListConverter());
    }
}


