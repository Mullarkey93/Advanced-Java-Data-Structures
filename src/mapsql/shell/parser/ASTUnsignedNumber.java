/* Generated By:JJTree: Do not edit this line. ASTUnsignedNumber.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package mapsql.shell.parser;

public
class ASTUnsignedNumber extends SimpleNode {
  public ASTUnsignedNumber(int id) {
    super(id);
  }

  public ASTUnsignedNumber(MapSQL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MapSQLVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=87b59f377db35a73a69da4f4751cab81 (do not edit this line) */
