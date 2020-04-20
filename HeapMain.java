class HeapMain{
  public static void main(String args[])
  {
        int arr[] = {50, 40, 60, 10, 20, 30};
        int n = arr.length;

        BinaryHeapSort obj = new BinaryHeapSort();
        obj.sort(arr);

        obj.display(arr);
   }
}
