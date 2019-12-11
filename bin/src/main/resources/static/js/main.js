$(document).ready(function(){
	$('.table .bEdt').on('click', function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		
		$.get(href, function(aluno, status){
			$('.form-modal #inputId').val(aluno.id);
			$('.form-modal #inputNumero').val(aluno.numero);
			$('.form-modal #inputNome').val(aluno.nome);
			$('.form-modal #inputNumero').val(aluno.numero);
			
			$('.form-modal #selectTurma').val(aluno.turma)
		})
		
		
		$('#alterar').modal();
	})
})