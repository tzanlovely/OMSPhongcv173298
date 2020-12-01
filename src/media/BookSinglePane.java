package media;

import com.oms.bean.Book;
import com.oms.bean.Media;

import javax.swing.*;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	private JLabel publisher;
	private JLabel publicationDate;
	private JLabel authors;
	private JLabel numberOfPages;
	private JLabel language;
	
	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}

	@Override
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		publisher = new JLabel();
		add(publisher, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		publicationDate = new JLabel();
		add(publicationDate, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		authors = new JLabel();
		add(authors, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		numberOfPages = new JLabel();
		add(numberOfPages, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		language = new JLabel();
		add(language, c);
	}

	@Override
	public void displayData() {
		super.displayData();

		if (t instanceof Book) {
			Book book = (Book) t;

			publisher.setText("Publisher: "+book.getPublisher());
			publicationDate.setText("Publication date: "+book.getPublicationDate());
			authors.setText("Authors: "+book.getAuthors());
			numberOfPages.setText("Number of pages: "+book.getNumberOfPages());
			language.setText("Language: "+book.getLanguage());
		}
	}
}
