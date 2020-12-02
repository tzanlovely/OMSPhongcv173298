package controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.Media;

import api.MediaApi;
import view.panel.searchpanel.BookSearchPane;
import view.panel.searchpanel.MediaSearchPane;
import view.panel.singlepanel.BookSinglePane;
import view.panel.singlepanel.MediaSinglePane;

public class UserBookPageController extends UserMediaPageController {
	public UserBookPageController() {
		super();
	}
	public UserBookPageController(CartController cartController) {
		super(cartController);
	}
	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return new MediaApi().getBooks(searchParams);
	}
	@Override
	public MediaSinglePane createSinglePane() {
		return new BookSinglePane();
	}
	@Override
	public MediaSearchPane createSearchPane() {
		return new BookSearchPane();
	}
}
