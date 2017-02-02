function TreeNode(data){
	this.data = data
	this.left = null
	this.right = null
}


function invert(tree) {
  function reverseTree(t) {
    if(!t) {
      return;
    }

    var temp = t.right;
    t.right = t.left;
    t.left = temp;

    reverseTree(t.left);

    reverseTree(t.right);
  }
  reverseTree(tree);
  return tree;
}


// function invert(tree) {
//   if(!tree) {
//     return tree;
//   }
//   var treeInverse = new TreeNode(tree.data);
//
//   function traverse(root, inverseRoot) {
//     if(root.left) {
//       inverseRoot.right = new TreeNode(root.left.data);
//       traverse(root.left, inverseRoot.right);
//     }
//     if(root.right) {
//       inverseRoot.left = new TreeNode(root.right.data);
//       traverse(root.right, inverseRoot.left);
//     }
//   }
//
//   traverse(tree, treeInverse);
//   return treeInverse;
// }


var t1 = new TreeNode(6);
var t2 = new TreeNode(8);
var t3 = new TreeNode(4);
var t4 = new TreeNode(9);
var t5 = new TreeNode(1);
var t6 = new TreeNode(2);
var t7 = new TreeNode(5);

t1.left = t3;
t1.right = t2;

t2.right = t4;

t3.left = t6;
t3.right = t7;
t6.left = t5;


var x = invert(t1);
console.log(x)
