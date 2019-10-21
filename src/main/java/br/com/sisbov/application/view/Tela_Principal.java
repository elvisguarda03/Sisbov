
package br.com.sisbov.application.view;

import br.com.sisbov.domain.entity.AnimalTM;

import javax.swing.*;

/**
 *
 * @author ALUNO
 */
public class Tela_Principal extends javax.swing.JFrame {
    AnimalTM Modelo;

     public void LoadTable(){
        Modelo = new AnimalTM();
        tab_lista_animais.setModel(Modelo);
        
        tab_lista_animais.getColumnModel().getColumn(0).setPreferredWidth(200);
        tab_lista_animais.getColumnModel().getColumn(1).setPreferredWidth(200);
        tab_lista_animais.getColumnModel().getColumn(2).setPreferredWidth(200);
        tab_lista_animais.getColumnModel().getColumn(3).setPreferredWidth(200);
        tab_lista_animais.getColumnModel().getColumn(4).setPreferredWidth(200);
        tab_lista_animais.getColumnModel().getColumn(5).setPreferredWidth(200);
        tab_lista_animais.getColumnModel().getColumn(6).setPreferredWidth(200);
    }
    
    public void Botoes(boolean N, boolean E, boolean R, boolean S, boolean C){
        btn_novo_animal.setEnabled(N);
        btn_editar_animal.setEnabled(E);
        btn_excluir_animal.setEnabled(R);
        btn_salvar_animal.setEnabled(S);
        btn_cancelar_animal.setEnabled(C);   
    }
    
    public Tela_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        LoadTable();
        Botoes(true,false,false,false,false);
    }

    @SuppressWarnings("unchecked")
       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_listar_TipoAnimais = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TXT_codigo_TipoAnimal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_nome_TipoAnimal = new javax.swing.JTextField();
        btn_salvar_TipoAnimal = new javax.swing.JButton();
        btn_cancelar_TipoAnimal = new javax.swing.JButton();
        btn_novo_TipoAnimal = new javax.swing.JButton();
        btn_editar_TipoAnimal = new javax.swing.JButton();
        btn_excluir_TipoAnimal = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_listar_raca = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_codigo_raca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_nome_raca = new javax.swing.JTextField();
        btn_salvar_raca = new javax.swing.JButton();
        btn_cancelar_raca = new javax.swing.JButton();
        btn_novo_raca = new javax.swing.JButton();
        btn_editar_raca = new javax.swing.JButton();
        btn_excluir_raca = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab_listar_vacinas = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_codigo_vacinas = new javax.swing.JTextField();
        txt_nome_vacinas = new javax.swing.JTextField();
        btn_salvar_vacinas = new javax.swing.JButton();
        btn_cancelar_vacinas = new javax.swing.JButton();
        btn_novo_vacinas = new javax.swing.JButton();
        btn_editar_vacinas = new javax.swing.JButton();
        btn_excluir_vacinas = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_lista_animais = new javax.swing.JTable();
        btn_novo_animal = new javax.swing.JButton();
        btn_editar_animal = new javax.swing.JButton();
        btn_excluir_animal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_brinco_animal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_peso_animal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_salvar_animal = new javax.swing.JButton();
        btn_cancelar_animal = new javax.swing.JButton();
        txt_dataNasc_animal = new javax.swing.JTextField();
        txt_sexo_animal = new javax.swing.JTextField();
        txt_raca_animal = new javax.swing.JTextField();
        txt_tipo_animal = new javax.swing.JTextField();
        txt_fazenda_animal = new javax.swing.JTextField();
        txt_vacina_animal = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab_listar_TipoAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_listar_TipoAnimais);
        if (tab_listar_TipoAnimais.getColumnModel().getColumnCount() > 0) {
            tab_listar_TipoAnimais.getColumnModel().getColumn(0).setPreferredWidth(50);
            tab_listar_TipoAnimais.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipos de animais:"));

        jLabel1.setText("Código:");

        TXT_codigo_TipoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_codigo_TipoAnimalActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        btn_salvar_TipoAnimal.setText("Salvar");
        btn_salvar_TipoAnimal.setBorder(null);

        btn_cancelar_TipoAnimal.setText("Cancelar");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_codigo_TipoAnimal, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_salvar_TipoAnimal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cancelar_TipoAnimal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                            .addComponent(c_nome_TipoAnimal, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXT_codigo_TipoAnimal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(c_nome_TipoAnimal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar_TipoAnimal, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btn_salvar_TipoAnimal, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        btn_novo_TipoAnimal.setText("Novo");

        btn_editar_TipoAnimal.setText("Editar");

        btn_excluir_TipoAnimal.setText("Excluir");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_novo_TipoAnimal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btn_editar_TipoAnimal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_excluir_TipoAnimal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar_TipoAnimal, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo_TipoAnimal, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir_TipoAnimal, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tipo dos Animais", jPanel2);

        tab_listar_raca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tab_listar_raca);
        if (tab_listar_raca.getColumnModel().getColumnCount() > 0) {
            tab_listar_raca.getColumnModel().getColumn(0).setResizable(false);
            tab_listar_raca.getColumnModel().getColumn(0).setPreferredWidth(50);
            tab_listar_raca.getColumnModel().getColumn(1).setResizable(false);
            tab_listar_raca.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Raças:"));

        jLabel13.setText("Código:");

        txt_codigo_raca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_racaActionPerformed(evt);
            }
        });

        jLabel14.setText("Nome:");

        btn_salvar_raca.setText("Salvar");
        btn_salvar_raca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_racaActionPerformed(evt);
            }
        });

        btn_cancelar_raca.setText("Cancelar");

        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigo_raca, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(btn_salvar_raca, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cancelar_raca, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_nome_raca, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo_raca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome_raca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar_raca, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar_raca, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btn_novo_raca.setText("Novo");

        btn_editar_raca.setText("Editar");

        btn_excluir_raca.setText("Excluir");

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jPanel10, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btn_novo_raca, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btn_editar_raca, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_excluir_raca, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar_raca, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo_raca, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir_raca, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Raça", jPanel6);

        tab_listar_vacinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tab_listar_vacinas);
        if (tab_listar_vacinas.getColumnModel().getColumnCount() > 0) {
            tab_listar_vacinas.getColumnModel().getColumn(0).setResizable(false);
            tab_listar_vacinas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tab_listar_vacinas.getColumnModel().getColumn(1).setResizable(false);
            tab_listar_vacinas.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Vacinas:"));

        jLabel15.setText("Código:");

        jLabel16.setText("Nome:");

        txt_codigo_vacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_vacinasActionPerformed(evt);
            }
        });

        btn_salvar_vacinas.setText("Salvar");

        btn_cancelar_vacinas.setText("Cancelar");

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigo_vacinas, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(btn_salvar_vacinas, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cancelar_vacinas, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_nome_vacinas, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_codigo_vacinas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_nome_vacinas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar_vacinas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_vacinas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btn_novo_vacinas.setText("Novo");

        btn_editar_vacinas.setText("Editar");
        btn_editar_vacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_vacinasActionPerformed(evt);
            }
        });

        btn_excluir_vacinas.setText("Excluir");

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jPanel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_novo_vacinas, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(btn_editar_vacinas, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_excluir_vacinas, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo_vacinas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_vacinas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir_vacinas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Vacinas", jPanel8);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fazendas:"));

        jLabel17.setText("Código:");

        jLabel18.setText("Nome:");

        jButton17.setText("Salvar");

        jButton18.setText("Cancelar");

        GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton19.setText("Novo");

        jButton20.setText("Editar");

        jButton21.setText("Excluir");

        GroupLayout jPanel13Layout = new GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fazenda", jPanel7);

        tab_lista_animais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brinco", "Raça", "Peso", "Sexo", "Tipo Animal", "Fazenda", "Vacinas"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class, String.class, String.class, Float.class, String.class, Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab_lista_animais);
        if (tab_lista_animais.getColumnModel().getColumnCount() > 0) {
            tab_lista_animais.getColumnModel().getColumn(0).setResizable(false);
            tab_lista_animais.getColumnModel().getColumn(0).setPreferredWidth(200);
            tab_lista_animais.getColumnModel().getColumn(1).setResizable(false);
            tab_lista_animais.getColumnModel().getColumn(1).setPreferredWidth(200);
            tab_lista_animais.getColumnModel().getColumn(2).setResizable(false);
            tab_lista_animais.getColumnModel().getColumn(2).setPreferredWidth(200);
            tab_lista_animais.getColumnModel().getColumn(3).setResizable(false);
            tab_lista_animais.getColumnModel().getColumn(3).setPreferredWidth(200);
            tab_lista_animais.getColumnModel().getColumn(4).setResizable(false);
            tab_lista_animais.getColumnModel().getColumn(4).setPreferredWidth(200);
            tab_lista_animais.getColumnModel().getColumn(5).setResizable(false);
            tab_lista_animais.getColumnModel().getColumn(5).setPreferredWidth(200);
            tab_lista_animais.getColumnModel().getColumn(6).setResizable(false);
            tab_lista_animais.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        btn_novo_animal.setText("Novo");
        btn_novo_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo_animalActionPerformed(evt);
            }
        });

        btn_editar_animal.setText("Editar");
        btn_editar_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_animalActionPerformed(evt);
            }
        });

        btn_excluir_animal.setText("Excluir");
        btn_excluir_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_animalActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Animal:"));

        jLabel5.setText("Brinco:");

        jLabel6.setText("Raça:");

        jLabel7.setText("Tipo do animal:");

        jLabel8.setText("Sexo:");

        jLabel9.setText("Peso:");

        jLabel10.setText("Fazenda:");

        jLabel11.setText("Vacinas:");

        jLabel12.setText("Data de nascimento:");

        btn_salvar_animal.setText("Salvar");
        btn_salvar_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_animalActionPerformed(evt);
            }
        });

        btn_cancelar_animal.setText("Cancelar");
        btn_cancelar_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_animalActionPerformed(evt);
            }
        });

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_brinco_animal))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sexo_animal))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tipo_animal))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_raca_animal)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txt_peso_animal)
                            .addComponent(txt_fazenda_animal)
                            .addComponent(txt_vacina_animal)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dataNasc_animal, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salvar_animal, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_animal, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_brinco_animal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txt_peso_animal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_raca_animal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(btn_salvar_animal, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_fazenda_animal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(btn_cancelar_animal, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_vacina_animal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_tipo_animal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_sexo_animal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_dataNasc_animal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_novo_animal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(btn_editar_animal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_excluir_animal, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_excluir_animal, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_animal, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo_animal, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 340, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Animais", jPanel1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_alunosMouseClicked(java.awt.event.MouseEvent evt) {                                        
        Botoes(true,true,true,false,false);
        int index = tab_lista_animais.getSelectedRow();
        if(index>=0 && index<Modelo.getRowCount()){
            String temp[] = Modelo.getAnimal(index);
            txt_brinco_animal.setText(temp[0]);
            txt_raca_animal.setText(temp[1]);
            txt_peso_animal.setText(temp[2]);
            txt_tipo_animal.setText(temp[3]);
            txt_fazenda_animal.setText(temp[4]);
            txt_vacina_animal.setText(temp[5]);
        }
      }
   
    
    private void TXT_codigo_TipoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_codigo_TipoAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_codigo_TipoAnimalActionPerformed

    private void btn_cancelar_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_animalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_animalActionPerformed

    private void txt_codigo_racaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_racaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_racaActionPerformed

    private void btn_salvar_racaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_racaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_racaActionPerformed

    private void btn_editar_vacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_vacinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editar_vacinasActionPerformed

    private void txt_codigo_vacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_vacinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_vacinasActionPerformed

    private void btn_novo_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo_animalActionPerformed
        Botoes(false,false,false,true,true);
    }//GEN-LAST:event_btn_novo_animalActionPerformed

    private void btn_editar_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_animalActionPerformed
        Botoes(false,false,false,true,true);
    }//GEN-LAST:event_btn_editar_animalActionPerformed

    private void btn_excluir_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_animalActionPerformed
        Botoes(true,false,false,false,false);
    }//GEN-LAST:event_btn_excluir_animalActionPerformed

    private void btn_salvar_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_animalActionPerformed
//        if( AnimalControle.SalvarAnimal(txt_brinco_animal.getText(),txt_raca_animal.getText(),txt_peso_animal.getText(),txt_tipo_animal.getText(),txt_dataNasc_animal.getText(),txt_sexo_animal.getText(), txt_fazenda_animal.getText(),txt_vacina_animal.getText()) ){
//            this.LoadTable();
//            JOptionPane.showMessageDialog(this, "Animal salvo com sucesso!");
//        }else
            JOptionPane.showMessageDialog(this, "Erro ao salvar o Animal!");
        
        Botoes(true,false,false,false,false);
    }//GEN-LAST:event_btn_salvar_animalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXT_codigo_TipoAnimal;
    private javax.swing.JButton btn_cancelar_TipoAnimal;
    private javax.swing.JButton btn_cancelar_animal;
    private javax.swing.JButton btn_cancelar_raca;
    private javax.swing.JButton btn_cancelar_vacinas;
    private javax.swing.JButton btn_editar_TipoAnimal;
    private javax.swing.JButton btn_editar_animal;
    private javax.swing.JButton btn_editar_raca;
    private javax.swing.JButton btn_editar_vacinas;
    private javax.swing.JButton btn_excluir_TipoAnimal;
    private javax.swing.JButton btn_excluir_animal;
    private javax.swing.JButton btn_excluir_raca;
    private javax.swing.JButton btn_excluir_vacinas;
    private javax.swing.JButton btn_novo_TipoAnimal;
    private javax.swing.JButton btn_novo_animal;
    private javax.swing.JButton btn_novo_raca;
    private javax.swing.JButton btn_novo_vacinas;
    private javax.swing.JButton btn_salvar_TipoAnimal;
    private javax.swing.JButton btn_salvar_animal;
    private javax.swing.JButton btn_salvar_raca;
    private javax.swing.JButton btn_salvar_vacinas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JTextField c_nome_TipoAnimal;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tab_lista_animais;
    private javax.swing.JTable tab_listar_TipoAnimais;
    private javax.swing.JTable tab_listar_raca;
    private javax.swing.JTable tab_listar_vacinas;
    private javax.swing.JTextField txt_brinco_animal;
    private javax.swing.JTextField txt_codigo_raca;
    private javax.swing.JTextField txt_codigo_vacinas;
    private javax.swing.JTextField txt_dataNasc_animal;
    private javax.swing.JTextField txt_fazenda_animal;
    private javax.swing.JTextField txt_nome_raca;
    private javax.swing.JTextField txt_nome_vacinas;
    private javax.swing.JTextField txt_peso_animal;
    private javax.swing.JTextField txt_raca_animal;
    private javax.swing.JTextField txt_sexo_animal;
    private javax.swing.JTextField txt_tipo_animal;
    private javax.swing.JTextField txt_vacina_animal;
    // End of variables declaration//GEN-END:variables
}
