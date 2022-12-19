package tree;

public class Main {

    public static void main(String[] args) {
        String text = "Hello world";
        Huffman tr = new Huffman();
        tr.buildHuffmanTree(text);
    }
}
