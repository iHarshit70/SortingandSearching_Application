
package sortingappjava;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class BinarySearch extends javax.swing.JFrame {

    //nt arr[],i,j,n;
      
    
    public BinarySearch() {
        initComponents();
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bubbleintro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        arraysizeinput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sortbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        etxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("binary search");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bubbleintro.setBackground(new java.awt.Color(255, 255, 255));
        bubbleintro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bubbleintro.setText("BINARY SEARCH");

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Back To Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        arraysizeinput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        arraysizeinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arraysizeinputActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enter Size of Array");

        sortbutton.setBackground(new java.awt.Color(204, 204, 204));
        sortbutton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        sortbutton.setText("Start");
        sortbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortbuttonActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        txtarea.setRows(5);
        txtarea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtarea);

        etxt.setEditable(false);
        etxt.setColumns(20);
        etxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etxt.setRows(5);
        etxt.setText("Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.\n\nIn case of binary search, array elements must be in ascending order. If you have unsorted array, you can sort the array using Arrays.sort(arr) method. or any sorting algorithm\n\nBinary Search Algorithm: The basic steps to perform Binary Search are:\n\n1.Begin with the mid element of the whole array as a search key.\n2.If the value of the search key is equal to the item then return an index of the search key.\n3. Or if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.\n4. Otherwise, narrow it to the upper half.\nRepeatedly check from the second point until the value is found or the interval is empty.");
        etxt.setToolTipText("");
        jScrollPane3.setViewportView(etxt);

        jLabel2.setBackground(new java.awt.Color(255, 102, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("OUTPUT");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Explanation ");

        jButton2.setBackground(new java.awt.Color(204, 51, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(bubbleintro, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(arraysizeinput, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sortbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(186, 186, 186))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(bubbleintro))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(arraysizeinput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(sortbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new SMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void arraysizeinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arraysizeinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arraysizeinputActionPerformed

  
    
    private void sortbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortbuttonActionPerformed
        // TODO add your handling code here:
        
      //  Scanner s = new Scanner(System.in);
                int i,search,first,last,middle,j,x;  
          int size = Integer.parseInt(arraysizeinput.getText());

          int[] arr = new int[size]; 

          JOptionPane.showMessageDialog(null,"Your array size is " +arr.length);


              for(int k=0; k<size; k++){
                  try{
                   arr[k] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number for index: "+k));
                  }
                   catch(HeadlessException | NumberFormatException e){
              this.dipose();
              txtarea.append("wrong input"+e);
          }
                  }
                 txtarea.append("Actual input of array\n");
                for (int element: arr) {

                        txtarea.append(String.valueOf((int)element)+" ");
                  }

                  //sorting the array
                  for(i=0; i<(size-1); i++)
                {
                   for(j=0; j<(size-i-1); j++)
                   {
                      if(arr[j]>arr[j+1])
                      {
                         x = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = x;
                      }
                   }
                }

                  //print sorted order
          txtarea.append("\nNow the sorted array is:");
                for(i=0; i<size; i++)
                   txtarea.append(" "+arr[i]+ " ");

                  //search value input
                   search = Integer.parseInt(JOptionPane.showInputDialog("Enter the element to be searched:"));





                // searching of array


                first = 0;
                last = size-1;
                middle = (first+last)/2;

                while(first<=last)
                {
                   if(arr[middle]<search)
                      first = middle+1;
                   else if(arr[middle]==search)
                   {
                      txtarea.append("\n\nThe element found at Index No." +middle+ ", Position No." +(middle+1));
                      break;
                   }
                   else
                      last = middle-1;

                   middle = (first+last)/2;
                }

                if(first>last){
                   txtarea.append("\n\nThe element is not available in given array");
                }

      
     
 
    }//GEN-LAST:event_sortbuttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        txtarea.setText(null);
        arraysizeinput.setText(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed
     
 
   
    public static void main(String args[]) {
        
     
      

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinarySearch().setVisible(true);
               
               
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arraysizeinput;
    private javax.swing.JLabel bubbleintro;
    private javax.swing.JTextArea etxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton sortbutton;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables

    private void dipose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
