package br.com.criandoapi.projeto.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	/* @NotNull
	@NotEmpty
	inclisive posso criar annotation (ver depois) */
	@NotBlank(message = "O nome é obrigatório!")
	@Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres")
	@Column(name = "nome", length = 200, nullable = false)
	private String nome;

	@Email(message = "Insira o email válido!")
	@NotBlank(message = "O email é obrigatório!")
	@Column(name = "email", length = 50, nullable = false)
	private String email;

	@NotBlank(message = "A senha é obrigatória!")
	@Column(name = "senha", columnDefinition = "TEXT", nullable = false)
	private String senha;

	@NotBlank(message = "O telefone é obrigatório!")
	@Column(name = "telefone", length = 15, nullable = false)
	private String telefone;

}
