import java.util.*;
public class MyQueue <E> {
    private Queue<E> queuelist;

    public MyQueue() {
        queuelist = new LinkedList<E>();
    }

    public void addTugas(E Tugas){
        queuelist.add(Tugas);
    }

    public void displayToDo(){
        Iterator<E> pengulang = queuelist.iterator();
        while(pengulang.hasNext()){
            E a = pengulang.next();
            System.out.println(a);
        }
    }

    public E removeTugas(){
        return queuelist.remove();
    }

    public boolean isEmpty(){
        return queuelist.isEmpty();
    }

    public void printFirstTodo(){

        Iterator<E> firstTodo = queuelist.iterator();
        E value = firstTodo.next();
        System.out.println("No. 1 "+value + " ");
        System.out.println();

    }
    public void printTodo(){
        Iterator<E> iterator = queuelist.iterator();

        Integer no = 1;
        while(iterator.hasNext()){
            E value = iterator.next();
            System.out.println("No. "+no+ " "+ value + " " );
            System.out.println();
            no++;
        }
    }

}