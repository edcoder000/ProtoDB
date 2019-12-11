import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Table extends JFrame {
    public Table() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jComboBoxColumnSelection = new javax.swing.JComboBox();
        jTextFieldValueInput = new javax.swing.JTextField();
        jButtonRunSort = new javax.swing.JButton();
        jButtonResetSort = new javax.swing.JButton();
        jScrollPaneTable = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        input1Сolumn = new javax.swing.JTextField();
        input2Сolumn = new javax.swing.JTextField();
        input3Сolumn = new javax.swing.JTextField();
        input5Сolumn = new javax.swing.JTextField();
        input4Сolumn = new javax.swing.JTextField();
        jButtonAddLine = new javax.swing.JButton();
        jButtonDelite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SuperMegaGrooveTable");

        jComboBoxColumnSelection.setModel(new DefaultComboBoxModel(new String[]{"---", "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5"}));
        jComboBoxColumnSelection.setAutoscrolls(true);

        jButtonRunSort.setText("Выполнить");
        jButtonRunSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunFilter();
            }
        });

        jButtonResetSort.setText("Сброс");
        jButtonResetSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetSortActionPerformed(evt);
            }
        });
        jButtonAddLine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addLine();
            }
        });
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"12", "4", "Asdf", "asdfasdf", "asdfas"},
                        {"1", "43", "ergsdfg", "dsfg", "dsfgsdf"},
                },
                new String[]{
                        "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5"
                }
        ));
        mainTable.setCellSelectionEnabled(true);
        jScrollPaneTable.setViewportView(mainTable);

        input1Сolumn.setMinimumSize(new java.awt.Dimension(6, 25));

        input2Сolumn.setMinimumSize(new java.awt.Dimension(6, 25));

        input3Сolumn.setMinimumSize(new java.awt.Dimension(6, 25));

        input5Сolumn.setMinimumSize(new java.awt.Dimension(6, 25));

        input4Сolumn.setMinimumSize(new java.awt.Dimension(6, 25));

        jButtonAddLine.setText("Добавить");

        jButtonDelite.setLabel("Удалить");
        jButtonDelite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeliteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPaneTable)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(input1Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(input2Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(input3Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(input4Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(input5Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonAddLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                                .addComponent(jComboBoxColumnSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonRunSort, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonResetSort, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonDelite, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxColumnSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonRunSort)
                                        .addComponent(jButtonResetSort)
                                        .addComponent(jButtonDelite))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(input3Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(input5Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(input4Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(input1Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(input2Сolumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonAddLine))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTextFieldValueInput.getAccessibleContext().setAccessibleParent(jTextFieldValueInput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }

    private void jButtonResetSortActionPerformed(ActionEvent evt) {
        jComboBoxColumnSelection.setSelectedIndex(0);
        jTextFieldValueInput.setText("");
        mainTable.setRowSorter(null);
    }

    private void RunFilter() {
        var column = jComboBoxColumnSelection.getSelectedIndex() - 1;
        var filterValue = jTextFieldValueInput.getText();
        if (column == -1) {
            return;
        }
        RowFilter<Object, Object> filter = new RowFilter<Object, Object>() {
            public boolean include(Entry entry) {
                var value = (String) entry.getValue(column);
                List<FilterPair> filters = new ArrayList<>(){};
                filters.add(new FilterPair(">", (x,y)-> x>y));
                filters.add(new FilterPair("=", (x,y) -> x==y));
                filters.add(new FilterPair("<", (x, y)-> x<y));
                for (var filter : filters) {
                    if (filterValue.startsWith(filter.StartValue)){
                        try {
                            var i = Integer.parseInt(value);
                            var f = Integer.parseInt(filterValue.substring(1));
                            return filter.FilterFunc.apply(i,f);
                        } catch (NumberFormatException e){ return false;}
                    }
                }
                return value.contains(filterValue);
            }
        };
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(mainTable.getModel());
        sorter.setRowFilter(filter);
        mainTable.setRowSorter(sorter);
    }

    private void jButtonDeliteActionPerformed(java.awt.event.ActionEvent evt) {
        //ave stackoverflow
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
        int[] rows = mainTable.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
    }

    private void addLine() {
        var data = new String[5];
        var index = 0;
        for (JTextField input : getNewLineInputs()) {
            data[index] = input.getText();
            input.setText("");
            index++;
        }
        var model = (DefaultTableModel) mainTable.getModel();
        model.addRow(data);
    }

    JTextField[] getNewLineInputs() {
        return new JTextField[]{
                input1Сolumn,
                input2Сolumn,
                input3Сolumn,
                input4Сolumn,
                input5Сolumn
        };
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }
    class FilterPair{
        public final String StartValue;
        public final BiFunction<Integer, Integer, Boolean> FilterFunc;
        FilterPair(String startValue, BiFunction<Integer, Integer, Boolean> filterFunc) {
            StartValue = startValue;
            FilterFunc = filterFunc;
        }
    }
    private javax.swing.JTextField input1Сolumn;
    private javax.swing.JTextField input2Сolumn;
    private javax.swing.JTextField input3Сolumn;
    private javax.swing.JTextField input4Сolumn;
    private javax.swing.JTextField input5Сolumn;
    private javax.swing.JButton jButtonAddLine;
    private javax.swing.JButton jButtonDelite;
    private javax.swing.JButton jButtonResetSort;
    private javax.swing.JButton jButtonRunSort;
    private javax.swing.JComboBox jComboBoxColumnSelection;
    private javax.swing.JScrollPane jScrollPaneTable;
    private javax.swing.JTextField jTextFieldValueInput;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable mainTable;
}
