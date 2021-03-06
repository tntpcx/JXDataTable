package JXTable;

import JXTable.Model.JXDataTableModel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXLabel;
import org.jdesktop.swingx.JXTable;

/**
 *
 * @author miguel
 */
public class JXDataTable extends javax.swing.JPanel {

    /** Creates new form JXTable */
    public JXDataTable() {
        initComponents();
    }

    public JXTable getJXDataTable(){
        return this.jxDataTable;
    }

    public javax.swing.JComboBox getJComboBoxRow(){
        return this.jcbNumFilas;
    }

    public JXLabel getJLabelDescripcion(){
        return this.jxlDescripcion;
    }

    public javax.swing.JTextField getJTextFieldBuscador(){
        return this.jtfBuscador;
    }

    public javax.swing.JToolBar getJTBMovimientos(){
        return this.jtbMovimientos;
    }

    public void setModel(JXDataTableModel model){
        this.jxDataTable.setModel(model);
        this.jxlDescripcion.setText(this.jxlDescripcion.getText().replace("%tr", Integer.toString(model.getNumRows())));
        this.jxlDescripcion.setText(this.jxlDescripcion.getText().replace("%r", this.jcbNumFilas.getSelectedItem().toString()));
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jcbNumFilas = new javax.swing.JComboBox();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jtfBuscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jxDataTable = new org.jdesktop.swingx.JXTable();
        jXPanel3 = new org.jdesktop.swingx.JXPanel();
        jxlDescripcion = new org.jdesktop.swingx.JXLabel();
        jtbMovimientos = new javax.swing.JToolBar();
        jbPrimero = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jbAdelante = new javax.swing.JButton();
        jbUltimo = new javax.swing.JButton();

        jXPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jXLabel1.setText("Filas");

        jcbNumFilas.setEditable(true);
        jcbNumFilas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "25", "35", "50" }));
        jcbNumFilas.setToolTipText("Numero de filas a mostrar");

        jXLabel2.setText("Buscar");

        jtfBuscador.setToolTipText("Filtra en contenido de la tabla");

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNumFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNumFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jxDataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jxDataTable.setToolTipText("Datos de la tabla");
        jScrollPane1.setViewportView(jxDataTable);

        jXPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jxlDescripcion.setText("Mostrando %r de %tr filas");
        jxlDescripcion.setToolTipText("Informa sobre los datos mostrados");

        jtbMovimientos.setFloatable(false);
        jtbMovimientos.setRollover(true);

        jbPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JXTable/Imagen/start.png"))); // NOI18N
        jbPrimero.setToolTipText("Primer conjunto de registros");
        jbPrimero.setFocusable(false);
        jbPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbMovimientos.add(jbPrimero);

        jbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JXTable/Imagen/back.png"))); // NOI18N
        jbAtras.setToolTipText("Anterior grupo de registros");
        jbAtras.setFocusable(false);
        jbAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbMovimientos.add(jbAtras);

        jbAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JXTable/Imagen/next.png"))); // NOI18N
        jbAdelante.setToolTipText("Siguiente grupo de registros");
        jbAdelante.setFocusable(false);
        jbAdelante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAdelante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbMovimientos.add(jbAdelante);

        jbUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JXTable/Imagen/finish.png"))); // NOI18N
        jbUltimo.setToolTipText("Último grupo de registros");
        jbUltimo.setFocusable(false);
        jbUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbMovimientos.add(jbUltimo);

        javax.swing.GroupLayout jXPanel3Layout = new javax.swing.GroupLayout(jXPanel3);
        jXPanel3.setLayout(jXPanel3Layout);
        jXPanel3Layout.setHorizontalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jxlDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addComponent(jtbMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jXPanel3Layout.setVerticalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jxlDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtbMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addComponent(jXPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel3;
    private javax.swing.JButton jbAdelante;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbPrimero;
    private javax.swing.JButton jbUltimo;
    private javax.swing.JComboBox jcbNumFilas;
    private javax.swing.JToolBar jtbMovimientos;
    private javax.swing.JTextField jtfBuscador;
    private org.jdesktop.swingx.JXTable jxDataTable;
    private org.jdesktop.swingx.JXLabel jxlDescripcion;
    // End of variables declaration//GEN-END:variables

}
