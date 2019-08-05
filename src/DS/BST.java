package merveyavuz_odev2;
/**
* @file 
* @description File chooser ile seçilen dosyanın içindeki txt uzantılı olanları okuyup text adlarını linked liste, 
*              içerisindeki kelimeleri ise ilgili nodea alfabetik sıralı, binary search tree olarak atayan programdır.
*              Arama Yap kısmında, girilen kelime linked list ve bst ile oluşturulan yapıda arananarak ekrana yazdırılır.
*              Listele kısmında, oluşturulan yapı üzerinde alfabetik olarak txt dosyaları ve içindekileri ekrana yazdırılır.
*              Çıkış kısmında, programdan çıkış yapılır.

 */
public class BST<T> {
    BSTNode<T> root;

    void insert(String kelime) {
        kelime = kelime.toLowerCase();
        if (root == null) {
            root = new BSTNode(kelime);
            return;
        }
        BSTNode temp;
        temp = root;
        while (true) {
            if (kelime.equals(temp.data)) { //Aynı kelimeden varsa eklenmiyor.
                return;
            }
            if (kelime.compareTo(temp.data.toString()) < 0) { //Eklenen kelime alfabede nodedaki datadan önceyse sola eklenir.
                if (temp.leftchild == null) { //Leftchild boş ise eklenir
                    temp.leftchild = new BSTNode(kelime);
                    return; 
                } else { //Leftchild boş değil ise left child üzerinde ilerlenir.
                    temp = temp.leftchild;
                }
            } else { //Eklenen kelime alfabede nodedaki datadan sonraysa sola eklenir.
                if (temp.rightchild == null) {
                    temp.rightchild = new BSTNode(kelime);
                    return;  
                } else {
                    temp = temp.rightchild;
                }
            }
        }
    }


    String printTree() {
        return printTree(root);
    }

    public StringBuilder sonuc = new StringBuilder("");

    private String printTree(BSTNode n) {
        if (n == null) { 
            return null;
        }
        printTree(n.leftchild);
        sonuc.append(n.data + " "); //Recursive olarak isimleri stringe ekler

        BST.this.printTree(n.rightchild);
        return sonuc.toString(); //StringBuilderı stringe dönüştürerek return eder.
    }
}
