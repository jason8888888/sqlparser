/* Generated By:JJTree: Do not edit this line. ASTAllCol.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package selectParser.parser;

public class ASTAllCol extends SimpleNode {
  public ASTAllCol(int id) {
    super(id);
  }

  public ASTAllCol(SelectParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SelectParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b50fdef7361395dceed01abb4e49c8e8 (do not edit this line) */