function TreeNode(data){
	this.data = data
	this.left = null
	this.right = null
}

function maxDepth(root) {
  var deepest = 1;

  function getDepth(node, depth) {
    if(depth > deepest) {
      deepest = depth;
    }
    if(node.left) {
      getDepth(node.left, depth+1);
    }
    if(node.right) {
      getDepth(node.right, depth+1);
    }
  }

  getDepth(root, 1);
  return deepest;
}

var x4 = new TreeNode(4);
var x5 = new TreeNode(5);
var x6 = new TreeNode(6);
var x7 = new TreeNode(7);
var x8 = new TreeNode(8);
var x12 = new TreeNode(12);
var x13 = new TreeNode(13);
var x14 = new TreeNode(14);
var x15 = new TreeNode(15);
var x17 = new TreeNode(17);
var x16 = new TreeNode(16);
var x18 = new TreeNode(18);
var x19 = new TreeNode(19);
var x22 = new TreeNode(22);

x7.left = x6;
x7.right = x8;
x6.left = x5;
x5.left = x4;
x8.right = x16;
x16.right = x19;
x16.left = x15;
x15.left = x12;
x15.right = x13;
x19.left = x17;
x17.right = x18;
x19.right = x22;

//  					7
//       6           8
//    5							   	16
// 4								15		  	19
//               12   13  17      22
//                          18
console.log(maxDepth(x7));
