import java.util.*;

public class MegaSorter {
  private ArrayList<Integer> list0;
  private ArrayList<Integer> list1;
  private ArrayList<Integer> list2;
  private ArrayList<Integer> list3;
  private ArrayList<Integer> list4;
  private ArrayList<Integer> list5;
  private ArrayList<Integer> list6;
  private ArrayList<Integer> list7;
  private ArrayList<Integer> list8;
  private ArrayList<Integer> list9;
  private ArrayList<Integer> listT;

  public MegaSorter(){
    list0 = new ArrayList<Integer>();
    list1 = new ArrayList<Integer>();
    list2 = new ArrayList<Integer>();
    list3 = new ArrayList<Integer>();
    list4 = new ArrayList<Integer>();
    list5 = new ArrayList<Integer>();
    list6 = new ArrayList<Integer>();
    list7 = new ArrayList<Integer>();
    list8 = new ArrayList<Integer>();
    list9 = new ArrayList<Integer>();
    listT = new ArrayList<Integer>();
  }

  /*decider takes in the output of the file and categorizes it. 
  the number will be added into one of the arrays below that collects numbers by the thousands. For example if the number is 5067 then it will be sent to list5*/
  public void decider(int number){
    if(number > 0 && number < 1000){
      list0.add(number);
      merge(list0, 0, list0.size()-1);
    }
    else if(number > 1000 && number < 2000){
      list1.add(number);
      merge(list1, 0, list1.size() - 1); 
    }
    else if(number > 2000 && number < 3000){
      list2.add(number);
      merge(list2, 0, list2.size() - 1);
    }
    else if(number > 3000 && number < 4000){
      list3.add(number);
      merge(list3, 0, list3.size() - 1);
    }
    else if(number > 4000 && number < 5000){
      list4.add(number);
      merge(list4, 0, list4.size() - 1);
    }
    else if(number > 5000 && number < 6000){
      list5.add(number);
      merge(list5, 0, list5.size() - 1);
    }
    else if(number > 6000 && number < 7000){
      list6.add(number);
      merge(list6, 0, list6.size() - 1);
    }
    else if(number > 7000 && number < 8000){
      list7.add(number);
      merge(list7, 0, list7.size() - 1);
    }
    else if(number > 8000 && number < 9000){
      list8.add(number);
      merge(list8, 0, list8.size() - 1);
    }
    else if(number > 9000 && number < 10000){
      list9.add(number);
      merge(list9, 0, list9.size() - 1);
    }
  }
//use quick sort to sort everything in each individual list. I got this code from programcreek.com since my code wasn't running when using the quick sort algorithm from class

  public void merge(ArrayList<Integer> a, int low, int high){
    if(a == null || a.size() == 0)
      return;
    if(low >= high)
      return;
    int middle = low + (high - low)/2;
    int pivot = a.get(middle);

    int i = low;
    int j = high;
    while(i <= j){
      while(a.get(i) < pivot){
        i++;
      }
      while(a.get(j) > pivot){
        j--;
      }
      if( i <= j){
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
        i++;
        j--;
      }
    }

    if(low < j)
      merge(a, low, j);
    if(high > i)
      merge(a, i, high);
  }

  //the purpose of together is to combine all the list together into one big array list
  public void together(){
    this.listT.addAll(list0);
    this.listT.addAll(list1);
    this.listT.addAll(list2);
    this.listT.addAll(list3);
    this.listT.addAll(list4);
    this.listT.addAll(list5);
    this.listT.addAll(list6);
    this.listT.addAll(list7);
    this.listT.addAll(list8);
    this.listT.addAll(list9);
  }

  public void printer(){
    for(int i = 0; i < listT.size(); i++){
      System.out.println(listT.get(i));
    }
  }
}