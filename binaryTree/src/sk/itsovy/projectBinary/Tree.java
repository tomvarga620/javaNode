package sk.itsovy.projectBinary;

public class Tree {

    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void addNode(Node node){
        Node parent = root;
            while(true){
                if(node.getValue()<parent.getValue()){
                    if(parent.getLeft()==null){
                        parent.setLeft(null);
                        break;
                    }
                    else
                    {
                        parent=parent.getLeft();
                    }
                }
                else

                    if(parent.getRight()==null){
                    parent.setRight(node);
                    break;
                }
                    else {

                    parent=parent.getRight();

                }

            }
    }

    public int getLevel(){
        //author
        //@date :
        //version 1.0
        //parametre
        //co vrati
        //description
        //todo
        return 0;
    }

    //todo
    public void vypisInOrder(Node node){
        if(node.getLeft()!=null){
            vypisInOrder(node.getLeft());
        }
        if(node.getRight()!=null){
            vypisInOrder(node.getRight());
        }
    }

    public void vypisPostOrder(){

    }

    public void vypisPreOrder(){

    }

}
