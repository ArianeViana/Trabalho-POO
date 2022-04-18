package br.com.trabalhoBanco;

public class Diretor {

		private String nome;
		private String cpf;
		private String senha;
		private float salario;

		//GETTERS AND SETTERS
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		//CONSTRUTOR
		public Diretor(String nome, String cpf) {
			super();
			this.nome = nome;
			this.cpf = cpf;
		}
		
		//MÉTODOS
		
				
		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public float getSalario() {
			return salario;
		}

		public void setSalario(float salario) {
			this.salario = salario;
		}

		@Override
		public String toString() {
			return "Diretor [nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + ", salario=" + salario + "]";
		}

		
}
