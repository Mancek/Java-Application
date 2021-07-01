/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra;

import hr.algebra.dal.Repository;
import hr.algebra.dal.RepositoryFactory;
import hr.algebra.model.Genre;
import hr.algebra.model.Movie;
import hr.algebra.model.MovieTableModel;
import hr.algebra.utils.FileUtils;
import hr.algebra.utils.IconUtils;
import hr.algebra.utils.MessageUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Manuel
 */
public class EditMoviesPanel extends javax.swing.JPanel {
    
    private static final String DIR = "assets";
    
    private List<JTextComponent> validationFields;
    private List<JLabel> errorlabels;
    
    private Repository repository;
    
    private MovieTableModel tableModel;
    
    private Movie selectedMovie;

    /**
     * Creates new form EditMoviesPanel
     */
    public EditMoviesPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        lbTitleError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfLink = new javax.swing.JTextField();
        lbLinkError = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPubDate = new javax.swing.JTextField();
        lbPubDateError = new javax.swing.JLabel();
        lbDescError = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDesc = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        tfPath = new javax.swing.JTextField();
        lbIconError = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMovies = new javax.swing.JTable();
        tfOrigTitle = new javax.swing.JTextField();
        lbOrigTitleError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbDurationError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfDuration = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        lbYearError = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfGenre = new javax.swing.JTextField();
        lbGenreError = new javax.swing.JLabel();
        btnClearForm = new javax.swing.JButton();

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/no_image.png"))); // NOI18N
        lbIcon.setMaximumSize(new java.awt.Dimension(500, 350));
        lbIcon.setMinimumSize(new java.awt.Dimension(500, 352));
        lbIcon.setPreferredSize(new java.awt.Dimension(500, 352));

        jLabel1.setText("Title");

        lbTitleError.setForeground(java.awt.Color.red);

        jLabel3.setText("Link");

        lbLinkError.setForeground(java.awt.Color.red);

        jLabel5.setText("Published date");

        tfPubDate.setName("Date"); // NOI18N

        lbPubDateError.setForeground(java.awt.Color.red);

        lbDescError.setForeground(java.awt.Color.red);

        jLabel8.setText("Description");

        taDesc.setColumns(20);
        taDesc.setLineWrap(true);
        taDesc.setRows(5);
        jScrollPane1.setViewportView(taDesc);

        btnDelete.setBackground(java.awt.Color.red);
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbIconError.setForeground(java.awt.Color.red);

        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        tbMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMoviesMouseClicked(evt);
            }
        });
        tbMovies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMoviesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbMovies);

        lbOrigTitleError.setForeground(java.awt.Color.red);

        jLabel2.setText("Original title");

        lbDurationError.setForeground(java.awt.Color.red);

        jLabel6.setText("Duration");

        tfDuration.setName(""); // NOI18N

        tfYear.setName(""); // NOI18N

        lbYearError.setForeground(java.awt.Color.red);

        jLabel7.setText("Year");

        jLabel4.setText("Genre");

        lbGenreError.setForeground(java.awt.Color.red);

        btnClearForm.setText("Clear form");
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfPubDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbPubDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbDurationError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbYearError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbTitleError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfOrigTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbOrigTitleError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnClearForm, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbLinkError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbGenreError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDescError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbIconError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfPath, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChoose)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTitleError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbOrigTitleError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfOrigTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbLinkError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lbGenreError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDescError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbPubDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfPubDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbDurationError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(lbYearError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)))
                    .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbIconError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(tfPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearForm)
                    .addComponent(btnChoose))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        Optional<File> file = FileUtils.uploadFile("Images", "jpg", "jpeg", "png");
        if(!file.isPresent()){
            return;
        }
        tfPath.setText(file.get().getAbsolutePath());
        setIcon(lbIcon, file.get());
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(formValid()) {
            try {
                String path = uploadPicture();
                Movie movie = new Movie(
                        tfTitle.getText().trim(),
                        tfOrigTitle.getText().trim(),
                        tfLink.getText().trim(), 
                        taDesc.getText().trim(), 
                        path, 
                        LocalDateTime.parse(tfPubDate.getText().trim(), Movie.DATE_FORMATTER),
                        Integer.parseInt(tfDuration.getText().trim()),
                        Integer.parseInt(tfYear.getText().trim()),
                        new Genre(tfGenre.getText().trim()));
                
                repository.create(movie);
                tableModel.setMovies(repository.select());
                
                clearForm();
            } catch (Exception ex) {
                Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(selectedMovie == null) {
            MessageUtils.showInfoMessage("Wrong op", "Please choose a movie!");
            return;
        }
        if(formValid()) {
            try {
                if (!tfPath.getText().trim().equals(selectedMovie.getPicturePath())) {
                    if (selectedMovie.getPicturePath() != null) {
                        Files.deleteIfExists(Paths.get(selectedMovie.getPicturePath()));
                    }
                    String path = uploadPicture();
                    selectedMovie.setPicturePath(path);
                }
                
                selectedMovie.setTitle(tfTitle.getText().trim());
                selectedMovie.setOriginalTitle(tfOrigTitle.getText().trim());
                selectedMovie.setLink(tfLink.getText().trim());
                selectedMovie.setDescription(taDesc.getText().trim());
                selectedMovie.setPublisedDate(LocalDateTime.parse(tfPubDate.getText().trim(), Movie.DATE_FORMATTER));
                selectedMovie.setDuration(Integer.parseInt(tfDuration.getText().trim()));
                selectedMovie.setYear(Integer.parseInt(tfYear.getText().trim()));
                selectedMovie.setGenre(new Genre(tfGenre.getText().trim()));
                
                repository.update(selectedMovie.getId(), selectedMovie);
                tableModel.setMovies(repository.select());
                clearForm();
            } catch (Exception ex) {
                Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(selectedMovie == null) {
            MessageUtils.showInfoMessage("Wrong op", "Please choose a movie!");
            return;
        }
        if(MessageUtils.showConfirmDialog("Delete", "Are you sure?") == JOptionPane.YES_OPTION) {
            try {
                if(selectedMovie.getPicturePath() != null) {
                    Files.deleteIfExists(Paths.get(selectedMovie.getPicturePath()));
                }
                repository.delete(selectedMovie.getId());
                tableModel.setMovies(repository.select());
                clearForm();
            } catch (Exception ex) {
                Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMoviesMouseClicked
        showMovie();
    }//GEN-LAST:event_tbMoviesMouseClicked

    private void tbMoviesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMoviesKeyReleased
        showMovie();
    }//GEN-LAST:event_tbMoviesKeyReleased

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDescError;
    private javax.swing.JLabel lbDurationError;
    private javax.swing.JLabel lbGenreError;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbIconError;
    private javax.swing.JLabel lbLinkError;
    private javax.swing.JLabel lbOrigTitleError;
    private javax.swing.JLabel lbPubDateError;
    private javax.swing.JLabel lbTitleError;
    private javax.swing.JLabel lbYearError;
    private javax.swing.JTextArea taDesc;
    private javax.swing.JTable tbMovies;
    private javax.swing.JTextField tfDuration;
    private javax.swing.JTextField tfGenre;
    private javax.swing.JTextField tfLink;
    private javax.swing.JTextField tfOrigTitle;
    private javax.swing.JTextField tfPath;
    private javax.swing.JTextField tfPubDate;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables

    private void init() {
        try {
            initValidation();
            initRepository();
            initTable();
        } catch (Exception ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Error", "Unable to load form");
            System.exit(1);
        }
    }

    private void initValidation() {
        validationFields = Arrays.asList(tfTitle, tfOrigTitle, tfLink, taDesc, tfPubDate, tfPath, tfDuration, tfYear, tfGenre);
        errorlabels = Arrays.asList(lbTitleError, lbOrigTitleError, lbLinkError, lbDescError, lbPubDateError, lbIconError, lbDurationError, lbYearError, lbGenreError);
    }

    private void initRepository() throws Exception {
        repository = RepositoryFactory.getMovieRepository();
    }

    private void initTable() throws Exception {
        tbMovies.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbMovies.setAutoCreateRowSorter(true);
        tbMovies.setRowHeight(25);
        new Thread(() -> {
            try {
                tableModel = new MovieTableModel(repository.select());
                tbMovies.setModel(tableModel);
            } catch (Exception ex) {
                Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }

    private void setIcon(JLabel label, File file) {
        try {
            label.setIcon(IconUtils.createIcon(file, label.getWidth(), label.getHeight()));
        } catch (IOException ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean formValid() {
        boolean ok = true;
        
        for(int i = 0; i < validationFields.size(); i++) {
            ok &= !validationFields.get(i).getText().trim().isEmpty();
            errorlabels.get(i).setText(validationFields.get(i).getText().trim().isEmpty() ? "X" : "");
            
            if("Date".equals(validationFields.get(i).getName())) {
                try {
                    LocalDateTime.parse(validationFields.get(i).getText().trim(), Movie.DATE_FORMATTER);
                    errorlabels.get(i).setText("");
                } catch (Exception e) {
                    errorlabels.get(i).setText("X");
                    ok = false;
                }
            }
        }
        
        return ok;
    }
    
    private String uploadPicture() throws IOException {
        
        String pictureUrl = tfPath.getText().trim();
        String ext = pictureUrl.substring(pictureUrl.lastIndexOf("."));
        String pictureName = UUID.randomUUID() + ext;
        String picturePath = DIR + File.separator + pictureName;
        FileUtils.copy(pictureUrl, picturePath);
        
        return picturePath;
    }

    private void clearForm() {
        validationFields.forEach(e -> e.setText(""));
        errorlabels.forEach(e -> e.setText(""));
        
        selectedMovie = null;
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/no_image.png"))); // NOI18N
    }

    private void showMovie() {
        
        int selectedRow = tbMovies.getSelectedRow();
        int rowIndex = tbMovies.convertRowIndexToModel(selectedRow);
        int id = (int)tableModel.getValueAt(rowIndex, 0);
        
        try {
            Optional<Movie> optMovie = repository.select(id);
            if(optMovie.isPresent()){
                selectedMovie = optMovie.get();
                FillForm(selectedMovie);
            }
        } catch (Exception ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void FillForm(Movie movie) {
        tfTitle.setText(movie.getTitle());
        tfOrigTitle.setText(movie.getOriginalTitle());
        tfLink.setText(movie.getLink());
        taDesc.setText(movie.getDescription());
        tfPubDate.setText(movie.getPublisedDate().format(Movie.DATE_FORMATTER));
        tfDuration.setText(String.valueOf(movie.getDuration()));
        tfYear.setText(String.valueOf(movie.getYear()));
        tfGenre.setText(movie.getGenre().toString());
        
        if(movie.getPicturePath() != null && Files.exists(Paths.get(movie.getPicturePath()))) {
            tfPath.setText(movie.getPicturePath());
            setIcon(lbIcon, new File(movie.getPicturePath()));
        }
    }
}
