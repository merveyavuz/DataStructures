package merveyavuz_odev2;

/**

* @description File chooser ile seçilen dosyanın içindeki txt uzantılı olanları okuyup text adlarını linked liste, 
*              içerisindeki kelimeleri ise ilgili nodea alfabetik sıralı, binary search tree olarak atayan programdır.
*              Arama Yap kısmında, girilen kelime linked list ve bst ile oluşturulan yapıda arananarak ekrana yazdırılır.
*              Listele kısmında, oluşturulan yapı üzerinde alfabetik olarak txt dosyaları ve içindekileri ekrana yazdırılır.
*              Çıkış kısmında, programdan çıkış yapılır.

 */
public class BSTNode<T> {

    T data;
    BSTNode<T> rightchild;
    BSTNode<T> leftchild;

    public BSTNode(T data) {
        this.data = data;
    }


}
