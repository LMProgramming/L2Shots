import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class main {

	private JFrame frame;
	private JTextField shotsCristales;
	private JTextField shotsSoulOres;
	private JTextField resultadoShots;
	private JTextField blessedCristales;
	private JTextField resultadoBlesseds;
	private JTextField blessedSpiritOres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculador de Shots");

		JPanel shots = new JPanel();
		shots.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		JPanel blesseds = new JPanel();
		blesseds.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(shots, GroupLayout.PREFERRED_SIZE, 236,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(blesseds, GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE)
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(shots, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(blesseds, Alignment.TRAILING,
										GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
						.addGap(210)));

		JLabel label = new JLabel("Precio Cristales =");

		JLabel lblPrecioSpiritOres = new JLabel("Precio Spirit Ores =");

		blessedCristales = new JTextField();
		blessedCristales.setColumns(10);

		resultadoBlesseds = new JTextField();
		resultadoBlesseds.setFont(new Font("Tahoma", Font.BOLD, 12));
		resultadoBlesseds.setEditable(false);
		resultadoBlesseds.setColumns(10);

		JLabel lblResultadoPrecioPor = new JLabel("Resultado Precio por Blessed= ");

		JButton blessedS = new JButton("");
		blessedS.setIcon(
				new ImageIcon(main.class.getResource("/images/etc_spell_shot_gold_i01.png")));
		blessedS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Funciones.comprobarCamposErroneos(blessedSpiritOres.getText(),
						blessedCristales.getText())) {
					resultadoBlesseds.setText((Funciones.calcularBlesseds("S", Integer.parseInt(blessedSpiritOres.getText()), Integer.parseInt(blessedCristales.getText()) ) ).toString());

				}
			}
		});

		JButton blessedA = new JButton("");
		blessedA.setIcon(
				new ImageIcon(main.class.getResource("/images/etc_spell_shot_silver_i01.png")));
		blessedA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!Funciones.comprobarCamposErroneos(blessedSpiritOres.getText(),
						blessedCristales.getText())) {
					resultadoBlesseds.setText((Funciones.calcularBlesseds("A", Integer.parseInt(blessedSpiritOres.getText()), Integer.parseInt(blessedCristales.getText()) ) ).toString());

				}
			}
		});

		JButton blessedB = new JButton("");
		blessedB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Funciones.comprobarCamposErroneos(blessedSpiritOres.getText(),
						blessedCristales.getText())) {
					resultadoBlesseds.setText((Funciones.calcularBlesseds("B", Integer.parseInt(blessedSpiritOres.getText()), Integer.parseInt(blessedCristales.getText()) ) ).toString());

				}
			}
		});
		blessedB.setIcon(
				new ImageIcon(main.class.getResource("/images/etc_spell_shot_red_i01.png")));

		JLabel label_3 = new JLabel("Calcular");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));

		blessedSpiritOres = new JTextField();
		blessedSpiritOres.setText("400");
		blessedSpiritOres.setColumns(10);
		GroupLayout gl_blesseds = new GroupLayout(blesseds);
		gl_blesseds.setHorizontalGroup(
				gl_blesseds.createParallelGroup(Alignment.LEADING).addGroup(gl_blesseds
						.createSequentialGroup().addGroup(gl_blesseds
								.createParallelGroup(Alignment.LEADING).addGroup(gl_blesseds
										.createSequentialGroup().addContainerGap().addGroup(
												gl_blesseds.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_blesseds
																.createSequentialGroup()
																.addComponent(label,
																		GroupLayout.PREFERRED_SIZE,
																		130,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(blessedCristales,
																		GroupLayout.PREFERRED_SIZE,
																		55,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_blesseds
																.createSequentialGroup()
																.addComponent(lblPrecioSpiritOres,
																		GroupLayout.PREFERRED_SIZE,
																		122,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(blessedSpiritOres,
																		GroupLayout.PREFERRED_SIZE,
																		55,
																		GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_blesseds.createSequentialGroup().addContainerGap()
										.addComponent(blessedB).addGap(5)
										.addGroup(gl_blesseds
												.createParallelGroup(Alignment.LEADING)
												.addComponent(label_3, GroupLayout.PREFERRED_SIZE,
														45, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_blesseds.createSequentialGroup()
														.addComponent(blessedA).addGap(5)
														.addComponent(blessedS)))))
						.addContainerGap(4, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_blesseds.createSequentialGroup()
								.addContainerGap(32, Short.MAX_VALUE)
								.addGroup(gl_blesseds.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_blesseds.createSequentialGroup()
												.addGap(62).addComponent(resultadoBlesseds,
														GroupLayout.PREFERRED_SIZE, 51,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(lblResultadoPrecioPor,
												GroupLayout.PREFERRED_SIZE, 194,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));
		gl_blesseds.setVerticalGroup(gl_blesseds.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_blesseds.createSequentialGroup().addGap(3)
						.addGroup(gl_blesseds.createParallelGroup(Alignment.BASELINE)
								.addComponent(label).addComponent(blessedCristales,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(3)
						.addGroup(gl_blesseds.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_blesseds.createSequentialGroup().addGap(17)
										.addComponent(lblPrecioSpiritOres))
								.addGroup(gl_blesseds.createSequentialGroup().addGap(11)
										.addComponent(blessedSpiritOres, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(15).addComponent(label_3)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_blesseds.createParallelGroup(Alignment.LEADING)
								.addComponent(blessedB).addComponent(blessedA)
								.addComponent(blessedS))
						.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
						.addComponent(lblResultadoPrecioPor)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(resultadoBlesseds, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		blesseds.setLayout(gl_blesseds);

		JLabel lblNewLabel = new JLabel("Precio Cristales =");

		shotsCristales = new JTextField();
		shotsCristales.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio Soul Ores =");

		shotsSoulOres = new JTextField();
		shotsSoulOres.setText("250");
		shotsSoulOres.setColumns(10);
		JButton shotsB = new JButton("");
		shotsB.setIcon(
				new ImageIcon(main.class.getResource("/images/etc_spirit_bullet_red_i00.png")));
		shotsB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Funciones.comprobarCamposErroneos(shotsSoulOres.getText(),
						shotsCristales.getText())) {
					resultadoShots.setText((Funciones.calcularShots("B", Integer.parseInt(shotsSoulOres.getText()), Integer.parseInt(shotsCristales.getText()) ) ).toString());
				
				}
			}
		});
	

		JButton shotsA = new JButton("");
		shotsA.setIcon(
				new ImageIcon(main.class.getResource("/images/etc_spirit_bullet_silver_i00.png")));
		shotsA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Funciones.comprobarCamposErroneos(shotsSoulOres.getText(),
						shotsCristales.getText())) {
					resultadoShots.setText((Funciones.calcularShots("A", Integer.parseInt(shotsSoulOres.getText()), Integer.parseInt(shotsCristales.getText()) ) ).toString());
				
				}
				
			}
		});

		JButton shotsS = new JButton("");
		shotsS.setIcon(
				new ImageIcon(main.class.getResource("/images/etc_spirit_bullet_gold_i00.png")));
		shotsS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Funciones.comprobarCamposErroneos(shotsSoulOres.getText(),
						shotsCristales.getText())) {
					resultadoShots.setText((Funciones.calcularShots("S", Integer.parseInt(shotsSoulOres.getText()), Integer.parseInt(shotsCristales.getText()) ) ).toString());
				}
			}
		});

		JLabel lblNewLabel_1 = new JLabel("Resultado Precio por Shot = ");

		resultadoShots = new JTextField();
		resultadoShots.setFont(new Font("Tahoma", Font.BOLD, 12));
		resultadoShots.setForeground(new Color(0, 0, 0));
		resultadoShots.setEditable(false);
		resultadoShots.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Calcular");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_shots = new GroupLayout(shots);
		gl_shots.setHorizontalGroup(gl_shots.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_shots.createSequentialGroup().addContainerGap()
						.addGroup(gl_shots.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPrecio, GroupLayout.DEFAULT_SIZE, 137,
										Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 137,
										Short.MAX_VALUE))
						.addGap(18)
						.addGroup(gl_shots.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(shotsCristales, 0, 0, Short.MAX_VALUE)
								.addComponent(shotsSoulOres, GroupLayout.DEFAULT_SIZE, 53,
										Short.MAX_VALUE))
						.addGap(9))
				.addGroup(Alignment.TRAILING,
						gl_shots.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_shots.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_shots.createSequentialGroup()
												.addComponent(shotsB).addGap(6).addComponent(shotsA)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(shotsS))
										.addGroup(gl_shots.createSequentialGroup().addGap(83)
												.addComponent(lblNewLabel_2)))
								.addContainerGap())
				.addGroup(gl_shots.createSequentialGroup().addGap(40).addComponent(lblNewLabel_1)
						.addContainerGap(49, Short.MAX_VALUE))
				.addGroup(gl_shots
						.createSequentialGroup().addGap(88).addComponent(resultadoShots,
								GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(84, Short.MAX_VALUE)));
		gl_shots.setVerticalGroup(gl_shots.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_shots.createSequentialGroup().addGap(6)
						.addGroup(gl_shots.createParallelGroup(Alignment.BASELINE)
								.addComponent(shotsCristales, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
						.addGap(11)
						.addGroup(gl_shots.createParallelGroup(Alignment.TRAILING)
								.addComponent(shotsSoulOres, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPrecio))
						.addGap(18).addComponent(lblNewLabel_2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_shots.createParallelGroup(Alignment.TRAILING)
								.addComponent(shotsB).addComponent(shotsS).addComponent(shotsA))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblNewLabel_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(resultadoShots, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(10)));
		shots.setLayout(gl_shots);
		frame.getContentPane().setLayout(groupLayout);
	}
}
