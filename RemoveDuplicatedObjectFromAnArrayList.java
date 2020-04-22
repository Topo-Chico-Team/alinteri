import java.util.ArrayList;
public class RemoveDuplicatedObjectFromAnArrayList
{
    public static ArrayList<Integer> RemoveDuplicatedObjectsFromAnArrayList(ArrayList<Integer> list)
    {
        for(int i = 0 ; i<list.size(); i++)
        {
            for(int j = 0 ; j<list.size();j++)
            {
                if(j>i && list.get(Integer.valueOf(i))==(list.get(Integer.valueOf(j))))
                {
                    list.remove(j);
                }
            }
        }
        return list;
    }
    public static ArrayList<String> RemoveDuplicatedObjectsFromAnArrayList2(ArrayList<String> list2)
    {
        for(int i = 0 ; i<list2.size(); i++)
        {
            for(int j = 0 ; j<list2.size();j++)
            {
                if(j>i && list2.get(i).equals(list2.get(j)))
                {
                    list2.remove(j);
                }
            }
        }
        return list2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); list.add(4); list.add(5); list.add(6); list.add(4); list.add(4); list.add(5); list.add(7);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("kamil");list2.add("kamil2"); list2.add("kamil1");list2.add("kamil1");list2.add("kamil");
        System.out.println(RemoveDuplicatedObjectsFromAnArrayList(list));
        System.out.println(RemoveDuplicatedObjectsFromAnArrayList2(list2));

    }
}
