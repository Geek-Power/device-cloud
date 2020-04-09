function random(lower, upper) {
	return Math.floor(Math.random() * (upper - lower + 1)) + lower;
}

if (ctx == undefined) {
	var ctx = document.currentScript.getAttribute("ctx");
	console.info("ctx 上下文", ctx);
}

let vue = new Vue({
	el : "#app",
	data : function() {
		return {
		}
	},
	created : function() {
	},
	methods : {
		setBgImg(){
			let bgDiv = this.$refs.bgDiv;
			bgDiv.style.backgroundImage = "url('"+ctx + "public/login/" + 0 + ".jpg"+"')";
			
			console.info("bgDiv",bgDiv.style.backgroundImage)
		}
	},
	mounted : function() {
		this.setBgImg();
		setInterval(() => {
			this.setBgImg();
		}, 10000);
		
	}
});