package controller;

import api.MediaApi;
import com.oms.bean.Book;
import com.oms.bean.Media;
import view.panel.listpanel.ADataListPane;
import view.panel.listpanel.AdminMediaListPane;
import view.panel.searchpanel.ADataSearchPane;
import view.panel.searchpanel.BookSearchPane;
import view.panel.singlepanel.ADataSinglePane;
import view.panel.singlepanel.BookSinglePane;

import javax.ws.rs.NotSupportedException;
import java.util.List;
import java.util.Map;

public class EditBookController extends ADataPageController<Media> implements IDataManageController<Media> {

    public EditBookController() {
        super();
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
        new MediaApi().updateBook((Book) media);
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
