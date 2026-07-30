/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;
        Node ans = new Node(curr.val);
        Map<Node, Node> map = new HashMap<>(); 
        while (curr != null){
            if (curr.next != null){
                Node nextNode = new Node(curr.next.val);
                ans.next = nextNode;
            }
            map.put(curr, ans);
            curr = curr.next;
            ans = ans.next;
        }

        curr = head;
        ans = map.get(curr);
        System.out.println(head.val + " " + ans.val);
        while (ans != null){
            ans.random = map.get(curr.random);
            ans = ans.next;
            curr = curr.next;
        }
        return map.get(head);
    }
}
