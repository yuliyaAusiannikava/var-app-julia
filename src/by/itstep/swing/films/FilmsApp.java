package by.itstep.swing.films;

import by.itstep.oop.inh.A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class FilmsApp extends JFrame {
    private static Film[] db = new Film[128];

    private static int position = 0;
    private static int filmsNumber = 0;

    private JLabel statusLbl = new JLabel("");

    private JLabel uidLbl = new JLabel("Unique ID: ");
    private JLabel imdbRateLbl = new JLabel("IMDB rate: ");
    private JLabel nameLbl = new JLabel("Name: ");
    private JLabel typeLbl = new JLabel("Type: ");
    private JLabel dateLbl = new JLabel("Date: ");
    private JLabel actorsLbl = new JLabel("Stars: ");

    private JTextField uidText = new JTextField();
    private JTextField imdbRateText = new JTextField();
    private JTextField nameText = new JTextField();
    private JTextField typeText = new JTextField();
    private JTextField dateText = new JTextField();
    private JTextField actorsText = new JTextField();


    static {
        Actor actor1 = new Actor(123, "Will Smith");
        Actor actor2 = new Actor(324, "Martin Lawrence");
        Actor actor3 = new Actor(451, "Lisa Boyle");
        Actor[] actors = {actor1, actor2, actor3};
        Film film = new Film(321, 7.6, "Bad Boys", new Date(), actors, "Action");

        Actor[] actors2 = {actor1, actor2};
        Film film2 = new Film(431, 7.1, "Bad Boys 2", new Date(), actors2, "Action");

        Actor[] actors3 = {new Actor(4312, "Leonardo DiCaprio"),
                new Actor(534, "Kate Winslet"),
                new Actor(5464, "Billy Zane")};
        Film film3 = new Film(789, 7.9, "Titanic", new Date(), actors3, "Action");

        db[0] = film;
        db[1] = film2;
        db[2] = film3;

        filmsNumber = 3;
    }

    public FilmsApp() {
        setTitle("Crazy Films Application");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);


        statusLbl.setBounds(10, 15, 320, 20);
        uidLbl.setBounds(40, 40, 120, 20);
        imdbRateLbl.setBounds(40, 60, 120, 20);
        nameLbl.setBounds(40, 80, 120, 20);
        typeLbl.setBounds(40, 100, 120, 20);
        dateLbl.setBounds(40, 120, 120, 20);
        actorsLbl.setBounds(40, 140, 120, 20);


        uidText.setBounds(100, 40, 120, 20);
        imdbRateText.setBounds(100, 60, 120, 20);
        nameText.setBounds(100, 80, 120, 20);
        typeText.setBounds(100, 100, 120, 20);
        dateText.setBounds(100, 120, 120, 20);
        actorsText.setBounds(100, 140, 120, 20);

        JLabel searchText = new JLabel("Find: ");
        searchText.setBounds(350, 10, 60, 20);

        JTextField searchField = new JTextField();
        searchField.setBounds(390, 10, 60, 20);


        //buttons: Back, Next, Add, Remove, Update, search
        JButton buttonNext = new JButton();
        buttonNext.setText("Next");
        buttonNext.setBounds(140, 200, 100, 20);

        JButton buttonBack = new JButton();
        buttonBack.setText("Back");
        buttonBack.setBounds(20, 200, 100, 20);

        JButton buttonSave = new JButton();
        buttonSave.setText("Save");
        buttonSave.setBounds(370, 200, 100, 20);
        buttonSave.setVisible(false);

        JButton buttonAdd = new JButton();
        buttonAdd.setText("Add");
        buttonAdd.setBounds(370, 200, 100, 20);

        JButton buttonGo = new JButton();
        buttonGo.setText("Go");
        buttonGo.setBounds(460, 10, 60, 20);

        JButton buttonRemove = new JButton();
        buttonRemove.setText("Remove");
        buttonRemove.setBounds(340, 240, 80, 30);

        JButton buttonUpdate = new JButton();
        buttonUpdate.setText("Update");
        buttonUpdate.setBounds(440, 240, 80, 30);


        boarding(uidLbl, imdbRateLbl, nameLbl, typeLbl, dateLbl, actorsLbl,
                uidText, imdbRateText, nameText, typeText, dateText, actorsText, buttonNext,
                buttonBack, buttonAdd, buttonGo, buttonRemove, buttonUpdate, searchText,
                searchField, statusLbl, buttonSave);

        //load first film
        loadFilm();
        buttonBack.setEnabled(false);


        //click actions
        buttonNext.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (position < filmsNumber - 1) {
                    position++; //next film
                    loadFilm();
                    buttonBack.setEnabled(true);
                } else {
                    buttonNext.setEnabled(false);
                }

                if (position == filmsNumber - 1) {
                    buttonNext.setEnabled(false);
                }
            }
        });

        buttonBack.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (position > 0) {
                    position--; //previous film
                    loadFilm();
                    buttonNext.setEnabled(true);
                } else {
                    buttonBack.setEnabled(false);
                }

                if (position == 0) {
                    buttonBack.setEnabled(false);
                }
            }
        });


        buttonUpdate.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Film film = getFilm();

                //save updated object in memory
                db[position] = film;
                statusLbl.setText("Film with UID " + film.getUid() + "has been updated successful");

            }
        });

        buttonAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSave.setVisible(true);
                buttonAdd.setVisible(false);
                uidText.setText("");
                imdbRateText.setText("");
                nameText.setText("");
                typeText.setText("");
                dateText.setText("");
                actorsText.setText("");

                //hide functions
                buttonAdd.setVisible(false);
                buttonRemove.setVisible(false);
                buttonUpdate.setVisible(false);
                buttonBack.setEnabled(false);
                buttonNext.setEnabled(false);

            }
        });

        buttonSave.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //insert NEW film
                Film film = getFilm();
                db[filmsNumber++] = film;
                statusLbl.setText("Film with UID " + film.getUid() + "has been created successful");

                //show functions
                buttonAdd.setVisible(true);
                buttonRemove.setVisible(true);
                buttonUpdate.setVisible(true);
                buttonBack.setEnabled(true);
                buttonNext.setEnabled(true);
                buttonSave.setVisible(false);

            }
        });

        buttonRemove.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Sure? You want to remove?", "Are you sure/",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    db[position] = null;
                    Film[] newDb = new Film[128];

                    for (int index = 0, newIndex = 0; index < filmsNumber; index++) {
                        if (db[index] != null) {
                            newDb[newIndex] = db[index];
                            newIndex++;
                        }

                    }
                    db = newDb;
                    statusLbl.setText("Film has been removed successful");
                } else {
                    statusLbl.setText("Cancel removing");

                }


            }
        });


        setVisible(true);
    }

    private void boarding(Component... components) {
        for (Component c : components) {
            add(c);
        }
    }

    private void loadFilm() {
        Film film = db[position];
        uidText.setText(db[position].getUid() + "");
        imdbRateText.setText(db[position].getImdbRate() + "");
        nameText.setText(db[position].getName() + "");
        typeText.setText(db[position].getType() + "");
        dateText.setText(db[position].getReleaseDate() + "");
        actorsText.setText(db[position].getActors()[0].toString() + "");
    }

    private Film getFilm() {
        Film film = new Film();
        film.setUid(Long.parseLong(uidText.getText()));
        film.setImdbRate(Double.parseDouble(imdbRateText.getText()));
        film.setName(nameText.getText());
        film.setReleaseDate(new Date());

        Actor[] actors = new Actor[1];
        Actor actor = new Actor(actorsText.getText());
        actors[0] = actor;
        film.setActors(actors);

        film.setType(typeText.getText());

        return film;
    }


    public static void main(String[] args) {
        new FilmsApp();
    }
}
