public class Sapato {
	
	public int codigo;
	public String descricao;
	//codigos de cor válidos: P=preto, B=branco, M=marrom
	public char codigoCor;
	public int tamanho;
	public double preco;
	//generos válidos: M=masculino, F=feminino
	public char genero;
	public int quantidadeEmEstoque;
	
	//Este método exibe informações do sapato
	public void mostrarInformacoes () {

		System.out.println ("Código: " + codigo);
		System.out.println ("Descrição: " + descricao);
		System.out.println ("Código da cor: " + codigoCor);
		System.out.println ("Tamanho: " + tamanho);
		System.out.println ("Preço: " + preco);
		System.out.println ("Gênero: " + genero);
		System.out.println ("Quantidade em estoque: " + quantidadeEmEstoque);

	} //Fim do metodo mostrarInformacoes

} //Fim da Classe