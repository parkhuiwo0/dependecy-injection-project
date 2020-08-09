import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/09
 * Time: 5:54 오후
 */
public class ContainerServiceTest {


    // @Inject를 쓰지 않은 테스트 케이스
    @Test
    public void getObject_BookRepository() {
        BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
        Assert.assertNotNull(bookRepository);
    }

    @Test
    public void getObject_BookService() {
        BookService bookService = ContainerService.getObject(BookService.class);
        Assert.assertNotNull(bookService);
        Assert.assertNotNull(bookService.bookRepository);
    }
}
