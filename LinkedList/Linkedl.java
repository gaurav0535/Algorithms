package LinkedList;

import java.util.HashMap;



public class Linkedl {
	
	ListNode head;
	
	public void insert(int data)
	{
		ListNode node = new ListNode();
		node.data=data;
		node.next=null;
		if(head == null)
		{
			head = node;
		}else {
			
			ListNode n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
			
		}
	}

	
	public void show()
	{
		ListNode node=head;
		if(head!=null) {
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
		}else {
			System.out.println("Please create a list first");
		}
		
	}
	
	public void insertAtStart(int data)
	{
		ListNode ptr=new ListNode();
		ptr.data=data;
		ptr.next=head;
		head=ptr;
	}
	
	public void insertAt(int index,int data)
	{
		ListNode ptr1 = new ListNode();
		ptr1.data=data;
		ptr1.next=null;
		ListNode point=head;
		
		int count = 0;
		if(index==0)
		{
			insertAtStart(data);
		}else 
		{
		while(point.next!=null)
		{
		
			
			if(count==index-1)
			{
				
				break;
			}
			count++;
			point=point.next;
		}
		
		ptr1.next=point.next;
		point.next=ptr1;
	}
	}
	
	public void delete(int index)
	{
		int i=0;
		ListNode ptr=head;
		ListNode del=null;
		if(index==0)
		{
			head=head.next;
		}else {
			while(i<index-1)
			{
				ptr=ptr.next;
				i++;
			}
			del=ptr.next;
			ptr.next=del.next;
			del=null;
		}		
	}
	
	public void hashMap()
	{
		HashMap<ListNode, Integer> map = new HashMap<>();
		ListNode ptr=head;
		int i=1;
		while(ptr!=null)
		{
			if(map.containsKey(ptr.next))
			{
				System.out.println("Awesome it is circular linked list");
			}else {
			map.put(ptr.next, ptr.data);
			ptr=ptr.next;
			System.out.println(i++);
			}
		System.out.println(map.keySet());
	//	System.out.println("Nothing comes out");
	}
}
	public void isCircular()
	{
		ListNode ptr=null,ptr1=null;
		ptr=head;
		ptr1=head;
		int found=0;
		while(true)
		{
			ptr=ptr.next;
			ptr1=(ptr1.next).next;
			if(ptr==ptr1)
			{
				System.out.println("Its circular");
				found++;
				lengthOfLoop(ptr1);
				
				break;
			}else if(ptr1==null){
				System.out.println("Damn its not circular");
			}
		}
	}
	public void lengthOfLoop(ListNode point)
	{
		
	}
}
