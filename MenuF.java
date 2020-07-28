import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class MenuF extends javax.swing.JFrame {
    // Creacion del arbol para toda la clase
    static Arbol arbol = new Arbol();
    
    public MenuF() { 
        initComponents();
        panelRecorridos.setVisible(true);
        inorden.setVisible(false);
        preorden.setVisible(false);
        postorden.setVisible(false);
        fondo.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        insertar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        recorridos = new javax.swing.JButton();
        informacion = new javax.swing.JLabel();
        verArbol = new javax.swing.JButton();
        campoInsertar = new javax.swing.JTextField();
        campoEliminar = new javax.swing.JTextField();
        panelRecorridos = new javax.swing.JPanel();
        resInorden = new javax.swing.JLabel();
        resPreorden = new javax.swing.JLabel();
        resPostorden = new javax.swing.JLabel();
        inorden = new javax.swing.JLabel();
        preorden = new javax.swing.JLabel();
        postorden = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fondo = new javax.swing.JPanel();
        arbolGraficado = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Árboles");

        insertar.setText("Insertar Nodo");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar Nodo");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        recorridos.setText("Ver Recorridos");
        recorridos.setToolTipText("");
        recorridos.setActionCommand("");
        recorridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorridosActionPerformed(evt);
            }
        });

        verArbol.setText("Graficar Árbol");
        verArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verArbolActionPerformed(evt);
            }
        });

        inorden.setText("IN-ORDEN");

        preorden.setText("PRE-ORDEN");

        postorden.setText("POST-ORDEN");

        javax.swing.GroupLayout panelRecorridosLayout = new javax.swing.GroupLayout(panelRecorridos);
        panelRecorridos.setLayout(panelRecorridosLayout);
        panelRecorridosLayout.setHorizontalGroup(
            panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecorridosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preorden)
                    .addGroup(panelRecorridosLayout.createSequentialGroup()
                        .addGroup(panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inorden)
                            .addComponent(postorden))
                        .addGap(30, 30, 30)
                        .addGroup(panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resInorden, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addComponent(resPostorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecorridosLayout.createSequentialGroup()
                    .addContainerGap(119, Short.MAX_VALUE)
                    .addComponent(resPreorden, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panelRecorridosLayout.setVerticalGroup(
            panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecorridosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resInorden, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inorden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(preorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resPostorden, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postorden))
                .addContainerGap())
            .addGroup(panelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRecorridosLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(resPreorden, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRecorridos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 207, Short.MAX_VALUE)
                        .addComponent(verArbol)
                        .addGap(152, 152, 152)
                        .addComponent(salir)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(jLabel1)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(eliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addComponent(recorridos)))
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(verArbol))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertar)
                            .addComponent(eliminar)
                            .addComponent(recorridos)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(430, Short.MAX_VALUE)))
        );

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        arbolGraficado.setEnabled(false);
        arbolGraficado.setFocusCycleRoot(false);
        arbolGraficado.setVisible(true);

        javax.swing.GroupLayout arbolGraficadoLayout = new javax.swing.GroupLayout(arbolGraficado.getContentPane());
        arbolGraficado.getContentPane().setLayout(arbolGraficadoLayout);
        arbolGraficadoLayout.setHorizontalGroup(
            arbolGraficadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );
        arbolGraficadoLayout.setVerticalGroup(
            arbolGraficadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(arbolGraficado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(arbolGraficado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(105, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verArbolActionPerformed
        repintarArbol();
    }//GEN-LAST:event_verArbolActionPerformed

    private void recorridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorridosActionPerformed
        resInorden.setText(arbol.inOrden(arbol.raiz));
        Arbol.inc = "";
        resPreorden.setText(arbol.preOrden(arbol.raiz));
        Arbol.inc = "";
        resPostorden.setText(arbol.postOrden(arbol.raiz));
        Arbol.inc = "";
        panelRecorridos.setVisible(true);
        informacion.setText("Recorridos de los nodos");
        inorden.setVisible(true);
        preorden.setVisible(true);
        postorden.setVisible(true);
    }//GEN-LAST:event_recorridosActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int inser = Integer.parseInt(campoEliminar.getText());
        arbol.borrar(inser);
        limpiar();
        informacion.setText(String.format("Nodo %d eliminado", inser));
        resInorden.setText(arbol.inOrden(arbol.raiz));
        Arbol.inc = "";
        resPreorden.setText(arbol.preOrden(arbol.raiz));
        Arbol.inc = "";
        resPostorden.setText(arbol.postOrden(arbol.raiz));
        Arbol.inc = "";
        panelRecorridos.setVisible(true);
    }//GEN-LAST:event_eliminarActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        int inser = Integer.parseInt(campoInsertar.getText());
        arbol.insertar(inser);
        limpiar();
        informacion.setText(String.format("Nodo %d añadido", inser));
    }//GEN-LAST:event_insertarActionPerformed
   
    public void repintarArbol() {
        jPanel2.removeAll();
        Rectangle tam = this.arbolGraficado.getBounds();
        arbolGraficado = null;
        arbolGraficado = new JInternalFrame("", false, false, false, false);
        jPanel2.add(arbolGraficado);
        arbolGraficado.setVisible(true);
        arbolGraficado.setBounds(tam);
        arbolGraficado.setEnabled(false);
        arbolGraficado.add(arbol.getdibujo(), BorderLayout.CENTER);
    }
        
    public void limpiar(){
        campoInsertar.setText("");       
        campoEliminar.setText("");
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
            java.util.logging.Logger.getLogger(MenuF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame arbolGraficado;
    private javax.swing.JTextField campoEliminar;
    private javax.swing.JTextField campoInsertar;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel informacion;
    private javax.swing.JLabel inorden;
    private javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelRecorridos;
    private javax.swing.JLabel postorden;
    private javax.swing.JLabel preorden;
    private javax.swing.JButton recorridos;
    private javax.swing.JLabel resInorden;
    private javax.swing.JLabel resPostorden;
    private javax.swing.JLabel resPreorden;
    private javax.swing.JButton salir;
    private javax.swing.JButton verArbol;
    // End of variables declaration//GEN-END:variables
}

class Arbol {
    public static class Nodo {
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave; 

        public Nodo (int indice){
            llave = indice;
            derecha = null;
            izquierda = null;
            padre = null;
        }
    }

    public static Nodo raiz;    
    public Arbol(){ raiz = null; }

    public void insertar(int i){
        Nodo nuevo = new Nodo(i);
        if (raiz == null){
            raiz = nuevo;
        } else {
            Nodo auxiliar = raiz;
            while (auxiliar != null){
                nuevo.padre = auxiliar;
                if (nuevo.llave >= auxiliar.llave){
                    auxiliar = auxiliar.derecha;
                } else {
                    auxiliar = auxiliar.izquierda;
                }
            }
            if (nuevo.llave < nuevo.padre.llave){
                nuevo.padre.izquierda = nuevo;
            } else {
                nuevo.padre.derecha = nuevo;
            }
        }
    }
    
    // ---------------------------------------------------------------------------
    public boolean buscar(Nodo raiz, int x) {
        if (raiz == null) return (false);
        int compara = ((Comparable) raiz.llave).compareTo(x);
        if (compara > 0) {
            return (buscar(raiz.izquierda, x));
        } else if (compara < 0) {
            return (buscar(raiz.derecha, x));
        } else {
            return (true);
        }
    }
    
    public int borrar(int x) {
        if (!this.buscar(this.raiz, x))  return 0;
        Nodo z = borrar(this.raiz, x);
        this.raiz = z;
        return x;
    }

    private Nodo borrar(Nodo raiz, int x) {
        if (raiz == null) return null;	
        
        int compara = ((Comparable) raiz.llave).compareTo(x);
        if (compara > 0) {
            raiz.izquierda = (borrar(raiz.izquierda, x));
        } else if (compara < 0) {
            raiz.derecha = (borrar(raiz.derecha , x));
        } else {
            if (raiz.izquierda != null && raiz.derecha != null) {
                Nodo cambiar = buscarMin(raiz.derecha);
                int aux = cambiar.llave;
                cambiar.llave = (raiz.llave);
                raiz.llave = (aux);
                raiz.derecha = (borrar(raiz.derecha, x));
            } else {
                raiz = (raiz.izquierda != null) ? raiz.izquierda : raiz.derecha;
            }
        }
        return raiz;
    }
    
    private Nodo buscarMin(Nodo r) {
        for (; r.izquierda != null; r = r.derecha);
        return (r);
    }
    //--------------------------------------------------------------------
    
    static String inc = "";
    public String postOrden(Nodo raiz){
        if (raiz != null){
            postOrden(raiz.izquierda);
            postOrden(raiz.derecha);
            inc = String.format("%s%d, ", inc, raiz.llave);
        } return inc;
    }
    public String preOrden(Nodo raiz){
        if (raiz != null){
            inc = String.format("%s%d, ", inc, raiz.llave);
            preOrden(raiz.izquierda); //pasa a
            preOrden(raiz.derecha);
        } return inc;
    }
    public String inOrden(Nodo raiz){
        if (raiz != null){
            inOrden(raiz.izquierda);
            inc = String.format("%s%d, ", inc, raiz.llave);
            inOrden(raiz.derecha);
        } return inc;
    }
  
    public JPanel getdibujo() {return new Grafico1(this); }
}

class Grafico1 extends JPanel {
    private Arbol arb;
    private HashMap posicionNodos = null;
    private HashMap subtreeSizes = null;
    private boolean dirty = true;
    private int parent2child = 20, child2child = 30;
    private Dimension empty = new Dimension(0,0);
    private FontMetrics fm = null;

    public Grafico1 (Arbol arb) {
        this.arb = arb;
        this.setBackground(Color.WHITE);
        posicionNodos = new HashMap();
        subtreeSizes = new HashMap();
        dirty = true;
        repaint();
    }

    private void calcularPosiciones() {
        posicionNodos.clear();
        subtreeSizes.clear();
        Arbol.Nodo root = this.arb.raiz;
        if (root != null) {
            TamanioSubarbol(root);
            calcularPosicion(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        }
    }
    
    private Dimension TamanioSubarbol(Arbol.Nodo n) {
        if (n == null) return new Dimension(0,0);
        
        Dimension ld = TamanioSubarbol(n.izquierda);
        Dimension rd = TamanioSubarbol(n.derecha);

        int h = fm.getHeight() + parent2child + Math.max(ld.height, rd.height);
        int w = ld.width + child2child + rd.width;

        Dimension d = new Dimension(w, h);
        subtreeSizes.put(n, d);
        return d;
    }

    private void calcularPosicion(Arbol.Nodo n, int left, int right, int top) {
        if (n == null) return;
        Dimension ld = (Dimension) subtreeSizes.get(n.izquierda);
        if (ld == null) ld = empty;
        Dimension rd = (Dimension) subtreeSizes.get(n.derecha);
        if (rd == null) rd = empty;

        int center = 0;
        
        if (right != Integer.MAX_VALUE)
            center = right - rd.width - child2child/2;
        else if (left != Integer.MAX_VALUE)
            center = left + ld.width + child2child/2;
        int width = fm.stringWidth(n.llave+"");

        posicionNodos.put(n,new Rectangle(center - width/2 - 3, top, width + 6, fm.getHeight()));

        calcularPosicion(n.izquierda, Integer.MAX_VALUE, center - child2child/2, top + fm.getHeight() + parent2child);
        calcularPosicion(n.derecha, center + child2child/2, Integer.MAX_VALUE, top + fm.getHeight() + parent2child);
    }

    private void dibujarArbol(Graphics2D g, Arbol.Nodo n, int puntox, int puntoy, int yoffs) {
        if (n == null) return;
        Rectangle r = (Rectangle) posicionNodos.get(n);
        g.draw(r);
        g.drawString(n.llave+"", r.x + 3, r.y + yoffs);
        if (puntox != Integer.MAX_VALUE)
            g.drawLine(puntox, puntoy, (int)(r.x + r.width/2), r.y);

        dibujarArbol(g, n.izquierda, (int)(r.x + r.width/2), r.y + r.height, yoffs);
        dibujarArbol(g, n.derecha, (int)(r.x + r.width/2), r.y + r.height, yoffs);
    }

    public void paint(Graphics g){
        super.paint(g);
        fm = g.getFontMetrics();
        if (dirty) {
            calcularPosiciones();
            dirty = false;
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(getWidth() / 2, parent2child);
        dibujarArbol(g2d, this.arb.raiz, Integer.MAX_VALUE, Integer.MAX_VALUE,
                fm.getLeading() + fm.getAscent());
        fm = null;
    }
}