function eliminar(id) {
	swal({
		title: "Esta seguro que desea eliminar??",
		text: "Una vez eliminado no podra deshacer los cambios!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/eliminar/"+id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Poof! El usuario ha sido eliminado!", {
					icon: "success",
				}).then((ok)=>{
					if(ok){
						location.href="/listar";
					}
				});
			} else {
				swal("El usuario no ha sido borrado!");
			}
		});
}