// Definition for a  binary tree node
function TreeNode(data){
	this.data = data
	this.left = null
	this.right = null
}

function hasPathSum(tree, integer) {

  if(!tree) {
    return tree;
  }
  function hasSum(node, currentSum) {
    if(!node.left && !node.right) {
      return currentSum === integer;
    }

    if(node.left) {
      var leftSum = hasSum(node.left, node.left.data + currentSum);
      if(leftSum) {
        return leftSum;
      }
    }
    if(node.right) {
      var rightSum = hasSum(node.right, node.right.data + currentSum);
      if(rightSum) {
        return rightSum;
      }
    }
  }

  return hasSum(tree, tree.data) ? 1 : 0;
}



// var t1 = new TreeNode(6);
// var t2 = new TreeNode(8);
// var t3 = new TreeNode(4);
// var t4 = new TreeNode(9);
// var t5 = new TreeNode(1);
// var t6 = new TreeNode(2);
// var t7 = new TreeNode(5);
//
// t1.left = t3;
// t1.right = t2;
//
// t2.right = t4;
//
// t3.left = t6;
// t3.right = t7;
// t6.left = t5;

var t1 = new TreeNode(1000);
var t2 = new TreeNode(2000);
var t3 = new TreeNode(-3001);

t1.left = t2;
t2.left = t3;


var x = hasPathSum(t1, -1);
console.log(x)


//
//                 6
//           4           8
//     2         5             9
// 1
