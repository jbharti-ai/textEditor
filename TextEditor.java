import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.net.*;

class TextEditor implements ActionListener
{
	
	
	
	
	JMenuBar menuBar;
	JMenu file;
	JMenu edit;
	JMenu themes;
	JMenu help;
	JTextArea textArea;
	JScrollPane scroll;
	JMenuItem darkTheme;
	JMenuItem moonLightTheme;
	JMenuItem save;
	JMenuItem open;
	JMenuItem close;
	JMenuItem cut;
	JMenuItem copy;
	JMenuItem paste;
	JMenuItem New;
	JMenuItem selectAll;
	JMenuItem videoHelp;
	JMenuItem documentHelp;
	JMenuItem fontSize;
	JPanel saveFileOptionWindow;
	JLabel fileLabel, dirLabel;
	JTextField fileName,dirName;
	
	TextEditor()
	{
		f = new JFrame("untitled_Document -1");
		Image img = Toolkit.getDefaultToolkit().getImage("filename with path");
		f.setIconImage(img);
		
		menuBar = new JMenuBar();
		file = new JMenu("file");
		edit  = new JMenu("edit");
		themes = new JMenu("themes");
		help = new JMenu("help");
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(themes);
		menuBar.add(help);
		f.setJMenuBar(menuBar);
		
		save = new JMenuItem("Save");
		open = new JMenuItem("Open");
		New = new JMenuItem("New");
		close = new JMenuItem("Exit");
		file.add(open);
		file.add(New);
		file.add(save);
		file.add(close);
		
		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste =  new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");
		fontSize = new JMenuItem("fontSize");
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		edit.add(fontSize);
		
		darkTheme = new JMenuItem("Dark Theme");
		documentHelp = new JMenuItem("Documentation");
		help.add(videoHelp);
		help.add(documentHelp);
		textArea = new JTextArea(32,88);
		f.add(textArea);
		
		scroll = new JScrollPane(textArea);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		f.add(scroll);
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		fontSize.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		New.addActionListener(this);
		close.addActionListener(this);
		documentHelp.addActionListener(this);
		videoHelp.addActionListener(this);
		moonLightTheme.addActionListener(this);
		darkTheme.addActionListener(this);
		
		f.addWindowListener(new WindowListener()
		{
			public void windowOpened(WindowEvent e){}
			public void windowClosed(WindowEvent e){}
			public void windowIconFied(WindowEvent e){}
			public void windowDeiconFied(WindowEvent e){}
			public void windowActivated(WindowEvent e){}
			public void windowDeActivated(WindowEvent e){}
		});
		KeyListener k = new KeyListener(){
			public void keyTyped(keyEvent e){}
			public void keyPressed(keyEvent e){
				int keycode = e.getKeyCode();
				if(keycode == keyEvent.VK_S && e.isControlDown())
				{
					saveTheFile();
				}
			}
		}
		textArea.addKeyListener(k);
		
		f.setSize(1000,596);
		f.setResizable(false);
		f.setLocation(250,1000);
		f.setLayout(new flowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cut)
			textArea.cut();
		if(e.getSource()==copy)
			textArea.copy();
		if(e.getSource()==paste)
			textArea.paste();
		if(e.getSource()==selectAll)
			textArea.selectAll();
		if(e.getSource()==fontSize)
		{
			String sizeOfFont = JOptionPane.showInputDialog(f,"enter font size",JOptionPane.OK_CANCEL_OPTION);
			if(sizeOfFont != null)
			{
				int convertSizeOfFont = Integer.parseInt(sizeOfFont);
				Font font  = new Font(Fonnt.SANS_SERIF,Font.PLAIN,convertSizeOfFont);
				textArea.setFont(font);
			}
		}
		if(e.getSource()==open)
		{
			JFileChooser chooseFile = new JFileChooser();
			int i = chooseFile.showOpenDialog(f);
			if(i == JFileChooser.APPROVE_OPTION)
			{
				File file = chooseFile.getSelectedFile();
				String filePath = file.getPath();
				String fileNameToShow = file.getName();
				f.setTitle(FileNameToShow);
			}
		}
		try{
			BufferedReader readfile = new BufferedReader(new fileReader(filePath));
			String tempString1 = "";
			String tempString2 = "";
			while((tempString1 = readfile.readFile() != null)
			{
				tempString2 = tempString1 + "\n";
			}
			textArea.setText(tempString2);
			readFile.close();
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		if(e.getSource() == save)
		{
			saveTheFile();
		}
		if(e.getSource()==New)
		{
			textArea.setText();
		}
		if(e.getSource()==close)
		{
			System.exit(1);
		}
		if(e.getSource()==darkTheme)
		{
			textArea.setBackground(Color.DARK_GRAY);
			textArea.setBackground(Color.WHITE);
		}
		if(e.getSource()==moonLightTheme)
		{
			textArea.setBackground(new Color(r:107,g:109,b:255));
			textArea.setForeground(Color:black);
		}
		if(e.getSource()==videoHelp)
		{
			try{
				Strig url = "  ";
				Desktop.getDesktop().browse(URL.create(url));
			}
			catch(Exception a)
			{
				a.printStackTrace();
			}
		}
	}
	public void saveTheFile()
	{
		saveFileOptionWindow = new JPanel(new GridLayout(rows:2,cols:1));
		fileLabel = new Jlabel(text:"filename :-");
		dirLabel = new JLabel(text:"save file to:-");
		fileName = new JTextField();
		dirName = new JTextField();
		saveFileOptionWindow.add(fileLabel);
		saveFileOptionWindow.add(fileName);
		saveFileOptionWindow.add(dirName);
		saveFileOptionWindow.add(dirLabel);
		JOptionPane.showMessageDialog(f,saveFileOptionWindow);
		String fileContent = textArea.getText();
		String filePath = dirName.getText();
		try{
			BufferedWriter writeContent = new BufferedWriter(new fileWrite(filePath)writeContent.write(fileContent));
			writeContent.close();
			JOptionPane.showMessageDialog(f,message:"file successfully saved");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		new TextEditor();
	}
}