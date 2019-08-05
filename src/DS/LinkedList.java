package merveyavuz_odev2;
/**

* @description File chooser ile seçilen dosyanın içindeki txt uzantılı olanları okuyup text adlarını linked liste, 
*              içerisindeki kelimeleri ise ilgili nodea alfabetik sıralı, binary search tree olarak atayan programdır.
*              Arama Yap kısmında, girilen kelime linked list ve bst ile oluşturulan yapıda arananarak ekrana yazdırılır.
*              Listele kısmında, oluşturulan yapı üzerinde alfabetik olarak txt dosyaları ve içindekileri ekrana yazdırılır.
*              Çıkış kısmında, programdan çıkış yapılır.
 
 */
public class LinkedList<T> {

    Node<T> head;

    public LinkedList() {
        head = null;
    }

    public void addLast(Node<T> newNode) {
        if (head == null) { //Yeni bir linked list oluşuyorsa yeni node head olarak oluşturulur.
            head = newNode; 
        } else {
            Node<T> temp = head;
            while (temp.nextNode != null) { //headden başlanarak linked list dolaşılarak sonuna ekler
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }


    public String search(T aranan) {
        Node<T> temp = head;
        String bulunanDosya = "";
        while (temp != null) {
            BSTNode<T> tempBSTNode = temp.tree.root;
            while (tempBSTNode != null) {  
                if (aranan.toString().compareTo(tempBSTNode.data.toString()) == 0) { //Aranan dosya nodea eşitse değeri atar, bulamazsa aramaya devam eder.
                    bulunanDosya = temp.data.toString();
                    break;
                } else if (aranan.toString().compareTo(tempBSTNode.data.toString()) < 0) {
                    tempBSTNode = tempBSTNode.leftchild;
                } else if (aranan.toString().compareTo(tempBSTNode.data.toString()) > 0) {
                    tempBSTNode = tempBSTNode.rightchild;
                }
            }
            temp = temp.nextNode;
        }
        if (bulunanDosya.equals("")) {
            return "Aranan kelime bulunamamıştır.";
        } else {
            return "Aranan kelime " + bulunanDosya + " dosyasında bulunmuştur.";
        }
    }

}
