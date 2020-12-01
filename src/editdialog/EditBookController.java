package editdialog;

import abstractdata.*;
import api.MediaApi;
import com.oms.bean.Book;
import com.oms.bean.Media;
import media.AdminMediaListPane;
import media.BookSearchPane;
import media.BookSinglePane;

import javax.ws.rs.NotSupportedException;
import java.util.List;
import java.util.Map;

public class EditBookController extends ADataPageController<Media> implements IDataManageController<Media> {
    private MediaApi api;

    public EditBookController() {
        super();
        api = new MediaApi();
    }

    @Override
    public void create(Media media) {
        throw new NotSupportedException();
    }

    @Override
    public void read(Media media) {
        throw new NotSupportedException();
    }

    @Override
    public void delete(Media media) {
        throw new NotSupportedException();
    }

    @Override
    public void update(Media media) {
        api.updateBook((Book) media);
    }

    @Override
    public ADataSearchPane createSearchPane() {
        return new BookSearchPane();
    }

    @Override
    public List<? extends Book> search(Map<String, String> searchParams) {
        return new MediaApi().getBooks(searchParams);
    }

    @Override
    public ADataSinglePane<Media> createSinglePane() {
        return new BookSinglePane();
    }

    @Override
    public ADataListPane<Media> createListPane() {
        return new AdminMediaListPane(this);
    }
}
