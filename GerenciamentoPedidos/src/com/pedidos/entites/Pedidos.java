package com.pedidos.entites;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gerenciamento")
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
