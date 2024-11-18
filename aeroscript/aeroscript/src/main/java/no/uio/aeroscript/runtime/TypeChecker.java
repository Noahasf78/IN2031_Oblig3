package no.uio.aeroscript.runtime;

import no.uio.aeroscript.antlr.AeroScriptBaseVisitor;
import no.uio.aeroscript.antlr.AeroScriptParser;
import no.uio.aeroscript.ast.expr.Node;
import no.uio.aeroscript.ast.expr.NumberNode;
import no.uio.aeroscript.ast.expr.OperationNode;
import no.uio.aeroscript.error.TypeError;

public class TypeChecker extends AeroScriptBaseVisitor<Object>  {
    private AeroScriptParser.ProgramContext ctx;

    public TypeChecker(AeroScriptParser.ProgramContext ctx) {
        this.ctx = ctx;
    }

    public void check() {
        visitProgram(ctx);
    }

    @Override
    public Object visitProgram(AeroScriptParser.ProgramContext ctx) {

        // Insert your type checker here.
        // Give a type error with 'throw new TypeError("Description")'
        return null;

    }

}
