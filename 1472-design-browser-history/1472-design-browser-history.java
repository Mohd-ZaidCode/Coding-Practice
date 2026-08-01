class BrowserHistory {
    class Node{
        Node next;
        Node prev;
        String val;
        public Node(String val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
        
    }
    Node home;
    Node current;
    public BrowserHistory(String homepage) {
        this.home=new Node(homepage);
        current=home;
    }
    
    public void visit(String url) {
        current.next=new Node(url);
        current.next.prev=current;
        current=current.next;
    }
    
    public String back(int steps) {
        while(current.prev!=null && steps-->0){
            current=current.prev;
        }
        return current.val;
    }
    
    public String forward(int steps) {
        while(current.next!=null && steps-->0){
            current=current.next;
        }
        return current.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */