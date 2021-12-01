class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node pre= null;
        Node curr= head;
        Node Next= null;
        while(curr!= null){
            Next= curr.next;
            curr.next= pre;
            pre= curr;
            curr=  Next;
        }
        head= pre;
        return head;
    }
}
