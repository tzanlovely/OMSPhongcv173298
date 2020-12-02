package view.panel.searchpanel;

import javax.swing.*;
import java.util.Map;

@SuppressWarnings("serial")
public class BookSearchPane extends PhysicalMediaSearchPane {
	private JTextField publisher;
	private JTextField language;

	public BookSearchPane() {
		super();
	}

	@Override
	public void buildControls() {
		super.buildControls();

		JLabel label = new JLabel("Publisher");
		publisher = new JTextField(15);
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(label, c);
		c.gridx = 1;
		c.gridy = row;
		add(publisher, c);

		label = new JLabel("Language");
		language = new JTextField(15);
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(label, c);
		c.gridx = 1;
		c.gridy = row;
		add(language, c);
	}

	@Override
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();

		if (!publisher.getText().trim().equals("")) {
			res.put("publisher", publisher.getText().trim());
		}

		if (!language.getText().trim().equals("")) {
			res.put("language", language.getText().trim());
		}

		return res;
	}
}
