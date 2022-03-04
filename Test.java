class datastruct{
	class testnode{
		private int age;
		private testnode next;
		
		public void setdata(int age){ this.age = age; }
		public int getdata(){ return age; }
		public void setnext(testnode ne){ next = ne; }
		public testnode getnext(){ return next; }
	}
	
	private static testnode head;
	public void linked_list(){
		head = new testnode();
		head.next = null;
	}
	
	public void createnode(int nodect){
		testnode nextnode = head;
		nextnode.setdata(15);
		for(int i=0;i<nodect;i++){
			nextnode.setnext(new testnode());
			nextnode = nextnode.getnext();
			nextnode.setdata(22+i);
			nextnode.setnext(null);
		}
	}
	
	public void addnode(int age){
		testnode nextnode = head;
		testnode buf = new testnode();
		while(true){
			if(nextnode.getdata() == age){
				buf = nextnode;
				nextnode  = nextnode.getnext();
				testnode addnode = new testnode();
				addnode.setdata(88);
				addnode.setnext(null);
				buf.setnext(addnode);
				addnode.setnext(nextnode);
				break;
			}
			nextnode = nextnode.getnext();
		}
	}
	
	public void deletenode(int find){
		testnode nextnode = head;
		testnode buf = new testnode();
		while((nextnode.getnext() != null) && (nextnode.getdata() != find)){
			buf = nextnode;
			nextnode = nextnode.getnext();
		}
		
		if(nextnode == null)
			System.out.print("No found...!!!");
		else
			buf.setnext(nextnode.getnext());
	}
	
	public void printallnode(){
		testnode node = head;
		while(true){
			System.out.print("age:" + node.getdata() + " node:" + node + "\n");
			node = node.getnext();
			if(node.getnext() == null) break;
		}
	}
	
	public void Tprintallnode(){
		testnode node = head;
		while(true){
			System.out.print("age:" + node.getdata() + " node:" + node + "\n");
			node = node.getnext();
			if(node.getnext() == null) break;
		}
	}
	
	public static void main(String[] args){
		System.out.print("(1)string reverse\n");
		String str = "123456saww3";
		char[] ch  = str.toCharArray();
		char[] buf = new char[ch.length];
		for(int i=0,st = ch.length;i<ch.length;i++)
			buf[i] = ch[--st];
		str = String.valueOf(buf);
		System.out.print(str + "\n");
		
		System.out.print("(2)count string length\n");
		String strt = "a2a2sd3af654w65f1a6";
		System.out.print("string length=" + strt.length() + "\n");
		
		System.out.print("(3)Linked list\n");
		datastruct link = new datastruct();
		link.linked_list();
		link.createnode(6);
		link.printallnode();
		
		System.out.print("---Add node\n");
		link.addnode(23);
		link.addnode(25);
		link.printallnode();
		
		System.out.print("---delete node\n");
		link.deletenode(25);
		link.deletenode(22);
		link.printallnode();
		
	}
}