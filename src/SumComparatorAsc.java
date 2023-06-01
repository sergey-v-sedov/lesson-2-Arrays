import java.util.Comparator;

public class SumComparatorAsc implements Comparator<Document> {
    @Override
    public int compare(Document doc1, Document doc2) {
        return doc1.sum - doc2.sum;
    }
}