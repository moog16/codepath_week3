function TreeNode(data){
	this.data = data
	this.left = null
	this.right = null
}

function inorder(root) {
  var ans = [];
  var memory = [];
  if(!root) {
    return ans;
  }

  var current = root;
  while(!!current) {
    if(current.left) {
      memory.push(current);
      current = current.left;
    } else {
      ans.push(current.data);
      if(current.right) {
        var temp = current;
        current = current.right;
        temp.right = null;
      } else {
        current = memory.pop();
				if(current) {
					current.left = null;
				}
      }
    }
  }

	return ans;
}

var x1 = new TreeNode(1);
var x2 = new TreeNode(2);
var x3 = new TreeNode(3);
var x4 = new TreeNode(4);
var x5 = new TreeNode(5);
var x6 = new TreeNode(6);
var x7 = new TreeNode(7);
var x8 = new TreeNode(8);


// x4.left = x3;
// x3.left = x2;
// x2.left = x1;
// x4.right = x5;
// x5.right = x7;
// x7.left = x6;
// x7.right = x8;


//  					4
//       3        5
//    2								7
// 1								6				8

console.log(inorder(x4));
