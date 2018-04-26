package appinventor.ai_angeles02blue.lobopark;

import com.google.appinventor.components.runtime.Component;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleMethod;
import gnu.mapping.CallContext;
import gnu.mapping.Symbol;
import gnu.mapping.Values;

public class Screen4$frame extends ModuleBody
{
  Screen4 $main;

  public Object apply0(ModuleMethod paramModuleMethod)
  {
    switch (paramModuleMethod.selector)
    {
    default:
      return super.apply0(paramModuleMethod);
    case 15:
      return Screen4.lambda2();
    case 16:
      this.$main.$define();
      return Values.empty;
    case 17:
      return Screen4.lambda3();
    case 18:
      return Screen4.lambda4();
    case 19:
      return Screen4.lambda5();
    case 20:
      return Screen4.lambda6();
    case 21:
      return Screen4.lambda7();
    case 22:
      return Screen4.lambda8();
    case 23:
      return Screen4.lambda9();
    case 24:
      return Screen4.lambda10();
    case 25:
      return Screen4.lambda11();
    case 26:
      return Screen4.lambda12();
    case 27:
      return Screen4.lambda13();
    case 28:
      return Screen4.lambda14();
    case 29:
      return Screen4.lambda15();
    case 30:
      return this.$main.SelectorDeLista1$BeforePicking();
    case 31:
      return this.$main.SelectorDeLista1$AfterPicking();
    case 32:
      return Screen4.lambda16();
    case 33:
      return Screen4.lambda17();
    case 34:
      return this.$main.conectarBT$Click();
    case 35:
      return Screen4.lambda18();
    case 36:
      return Screen4.lambda19();
    case 37:
      return Screen4.lambda20();
    case 38:
      return Screen4.lambda21();
    case 39:
      return Screen4.lambda22();
    case 40:
      return Screen4.lambda23();
    case 41:
      return Screen4.lambda24();
    case 42:
      return Screen4.lambda25();
    case 43:
      return Screen4.lambda26();
    case 44:
      return Screen4.lambda27();
    case 45:
      return Screen4.lambda28();
    case 46:
      return Screen4.lambda29();
    case 47:
      return Screen4.lambda30();
    case 48:
      return Screen4.lambda31();
    case 49:
      return Screen4.lambda32();
    case 50:
      return Screen4.lambda33();
    case 51:
      return Screen4.lambda34();
    case 52:
      return Screen4.lambda35();
    case 53:
      return Screen4.lambda36();
    case 54:
      return Screen4.lambda37();
    case 55:
      return Screen4.lambda38();
    case 56:
      return Screen4.lambda39();
    case 57:
      return Screen4.lambda40();
    case 58:
      return Screen4.lambda41();
    case 59:
      return Screen4.lambda42();
    case 60:
      return Screen4.lambda43();
    case 61:
      return Screen4.lambda44();
    case 62:
      return Screen4.lambda45();
    case 63:
      return this.$main.salir$Click();
    case 64:
      return Screen4.lambda46();
    case 65:
      return Screen4.lambda47();
    case 66:
      return this.$main.Reloj1$Timer();
    case 67:
      return Screen4.lambda48();
    case 68:
      return Screen4.lambda49();
    case 69:
    }
    return this.$main.Reloj2_Borrar$Timer();
  }

  // ERROR //
  public Object apply1(ModuleMethod paramModuleMethod, Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 18	gnu/expr/ModuleMethod:selector	I
    //   4: tableswitch	default:+64 -> 68, 1:+71->75, 2:+64->68, 3:+83->87, 4:+64->68, 5:+103->107, 6:+64->68, 7:+64->68, 8:+64->68, 9:+64->68, 10:+131->135, 11:+143->147, 12:+155->159
    //   69: aload_1
    //   70: aload_2
    //   71: invokespecial 203	gnu/expr/ModuleBody:apply1	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;)Ljava/lang/Object;
    //   74: areturn
    //   75: aload_0
    //   76: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   79: aload_2
    //   80: invokevirtual 207	appinventor/ai_angeles02blue/lobopark/Screen4:androidLogForm	(Ljava/lang/Object;)V
    //   83: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   86: areturn
    //   87: aload_0
    //   88: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   91: astore 6
    //   93: aload_2
    //   94: checkcast 209	gnu/mapping/Symbol
    //   97: astore 8
    //   99: aload 6
    //   101: aload 8
    //   103: invokevirtual 213	appinventor/ai_angeles02blue/lobopark/Screen4:lookupInFormEnvironment	(Lgnu/mapping/Symbol;)Ljava/lang/Object;
    //   106: areturn
    //   107: aload_0
    //   108: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   111: astore_3
    //   112: aload_2
    //   113: checkcast 209	gnu/mapping/Symbol
    //   116: astore 5
    //   118: aload_3
    //   119: aload 5
    //   121: invokevirtual 217	appinventor/ai_angeles02blue/lobopark/Screen4:isBoundInFormEnvironment	(Lgnu/mapping/Symbol;)Z
    //   124: ifeq +7 -> 131
    //   127: getstatic 223	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   130: areturn
    //   131: getstatic 226	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   134: areturn
    //   135: aload_0
    //   136: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   139: aload_2
    //   140: invokevirtual 229	appinventor/ai_angeles02blue/lobopark/Screen4:addToFormDoAfterCreation	(Ljava/lang/Object;)V
    //   143: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   146: areturn
    //   147: aload_0
    //   148: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   151: aload_2
    //   152: invokevirtual 232	appinventor/ai_angeles02blue/lobopark/Screen4:sendError	(Ljava/lang/Object;)V
    //   155: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   158: areturn
    //   159: aload_0
    //   160: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   163: aload_2
    //   164: invokevirtual 235	appinventor/ai_angeles02blue/lobopark/Screen4:processException	(Ljava/lang/Object;)V
    //   167: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   170: areturn
    //   171: astore 7
    //   173: new 237	gnu/mapping/WrongType
    //   176: dup
    //   177: aload 7
    //   179: ldc 239
    //   181: iconst_1
    //   182: aload_2
    //   183: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   186: athrow
    //   187: astore 4
    //   189: new 237	gnu/mapping/WrongType
    //   192: dup
    //   193: aload 4
    //   195: ldc 244
    //   197: iconst_1
    //   198: aload_2
    //   199: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   202: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   93	99	171	java/lang/ClassCastException
    //   112	118	187	java/lang/ClassCastException
  }

  // ERROR //
  public Object apply2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 18	gnu/expr/ModuleMethod:selector	I
    //   4: tableswitch	default:+68 -> 72, 2:+76->80, 3:+100->104, 4:+68->72, 5:+68->72, 6:+121->125, 7:+145->149, 8:+68->72, 9:+158->162, 10:+68->72, 11:+68->72, 12:+68->72, 13:+68->72, 14:+171->175
    //   73: aload_1
    //   74: aload_2
    //   75: aload_3
    //   76: invokespecial 248	gnu/expr/ModuleBody:apply2	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   79: areturn
    //   80: aload_0
    //   81: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   84: astore 10
    //   86: aload_2
    //   87: checkcast 209	gnu/mapping/Symbol
    //   90: astore 12
    //   92: aload 10
    //   94: aload 12
    //   96: aload_3
    //   97: invokevirtual 252	appinventor/ai_angeles02blue/lobopark/Screen4:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   100: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   103: areturn
    //   104: aload_0
    //   105: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   108: astore 7
    //   110: aload_2
    //   111: checkcast 209	gnu/mapping/Symbol
    //   114: astore 9
    //   116: aload 7
    //   118: aload 9
    //   120: aload_3
    //   121: invokevirtual 255	appinventor/ai_angeles02blue/lobopark/Screen4:lookupInFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   124: areturn
    //   125: aload_0
    //   126: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   129: astore 4
    //   131: aload_2
    //   132: checkcast 209	gnu/mapping/Symbol
    //   135: astore 6
    //   137: aload 4
    //   139: aload 6
    //   141: aload_3
    //   142: invokevirtual 258	appinventor/ai_angeles02blue/lobopark/Screen4:addToGlobalVarEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   145: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   148: areturn
    //   149: aload_0
    //   150: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   153: aload_2
    //   154: aload_3
    //   155: invokevirtual 262	appinventor/ai_angeles02blue/lobopark/Screen4:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   158: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   161: areturn
    //   162: aload_0
    //   163: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   166: aload_2
    //   167: aload_3
    //   168: invokevirtual 265	appinventor/ai_angeles02blue/lobopark/Screen4:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   171: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   174: areturn
    //   175: aload_0
    //   176: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   179: aload_2
    //   180: aload_3
    //   181: invokevirtual 269	appinventor/ai_angeles02blue/lobopark/Screen4:lookupHandler	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   184: areturn
    //   185: astore 11
    //   187: new 237	gnu/mapping/WrongType
    //   190: dup
    //   191: aload 11
    //   193: ldc_w 271
    //   196: iconst_1
    //   197: aload_2
    //   198: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   201: athrow
    //   202: astore 8
    //   204: new 237	gnu/mapping/WrongType
    //   207: dup
    //   208: aload 8
    //   210: ldc 239
    //   212: iconst_1
    //   213: aload_2
    //   214: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   217: athrow
    //   218: astore 5
    //   220: new 237	gnu/mapping/WrongType
    //   223: dup
    //   224: aload 5
    //   226: ldc_w 273
    //   229: iconst_1
    //   230: aload_2
    //   231: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   234: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   86	92	185	java/lang/ClassCastException
    //   110	116	202	java/lang/ClassCastException
    //   131	137	218	java/lang/ClassCastException
  }

  // ERROR //
  public Object apply4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 18	gnu/expr/ModuleMethod:selector	I
    //   4: lookupswitch	default:+28->32, 8:+40->44, 13:+57->61
    //   33: aload_1
    //   34: aload_2
    //   35: aload_3
    //   36: aload 4
    //   38: aload 5
    //   40: invokespecial 277	gnu/expr/ModuleBody:apply4	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: areturn
    //   44: aload_0
    //   45: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   48: aload_2
    //   49: aload_3
    //   50: aload 4
    //   52: aload 5
    //   54: invokevirtual 281	appinventor/ai_angeles02blue/lobopark/Screen4:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   57: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   60: areturn
    //   61: aload_0
    //   62: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen4$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen4;
    //   65: astore 6
    //   67: aload_2
    //   68: checkcast 283	com/google/appinventor/components/runtime/Component
    //   71: astore 8
    //   73: aload_3
    //   74: checkcast 285	java/lang/String
    //   77: astore 10
    //   79: aload 4
    //   81: checkcast 285	java/lang/String
    //   84: astore 12
    //   86: aload 5
    //   88: checkcast 287	[Ljava/lang/Object;
    //   91: astore 14
    //   93: aload 6
    //   95: aload 8
    //   97: aload 10
    //   99: aload 12
    //   101: aload 14
    //   103: invokevirtual 291	appinventor/ai_angeles02blue/lobopark/Screen4:dispatchEvent	(Lcom/google/appinventor/components/runtime/Component;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Z
    //   106: ifeq +7 -> 113
    //   109: getstatic 223	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   112: areturn
    //   113: getstatic 226	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   116: areturn
    //   117: astore 7
    //   119: new 237	gnu/mapping/WrongType
    //   122: dup
    //   123: aload 7
    //   125: ldc_w 292
    //   128: iconst_1
    //   129: aload_2
    //   130: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   133: athrow
    //   134: astore 9
    //   136: new 237	gnu/mapping/WrongType
    //   139: dup
    //   140: aload 9
    //   142: ldc_w 292
    //   145: iconst_2
    //   146: aload_3
    //   147: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   150: athrow
    //   151: astore 11
    //   153: new 237	gnu/mapping/WrongType
    //   156: dup
    //   157: aload 11
    //   159: ldc_w 292
    //   162: iconst_3
    //   163: aload 4
    //   165: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   168: athrow
    //   169: astore 13
    //   171: new 237	gnu/mapping/WrongType
    //   174: dup
    //   175: aload 13
    //   177: ldc_w 292
    //   180: iconst_4
    //   181: aload 5
    //   183: invokespecial 242	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   186: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   67	73	117	java/lang/ClassCastException
    //   73	79	134	java/lang/ClassCastException
    //   79	86	151	java/lang/ClassCastException
    //   86	93	169	java/lang/ClassCastException
  }

  public int match0(ModuleMethod paramModuleMethod, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default:
      return super.match0(paramModuleMethod, paramCallContext);
    case 69:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 68:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 67:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 66:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 65:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 64:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 63:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 62:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 61:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 60:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 59:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 58:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 57:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 56:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 55:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 54:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 53:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 52:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 51:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 50:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 49:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 48:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 47:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 46:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 45:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 44:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 43:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 42:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 41:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 40:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 39:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 38:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 37:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 36:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 35:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 34:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 33:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 32:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 31:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 30:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 29:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 28:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 27:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 26:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 25:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 24:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 23:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 22:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 21:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 20:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 19:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 18:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 17:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 16:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 15:
    }
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 0;
    return 0;
  }

  public int match1(ModuleMethod paramModuleMethod, Object paramObject, CallContext paramCallContext)
  {
    int i = -786431;
    switch (paramModuleMethod.selector)
    {
    case 2:
    case 4:
    case 6:
    case 7:
    case 8:
    case 9:
    default:
      i = super.match1(paramModuleMethod, paramObject, paramCallContext);
    case 12:
    case 11:
    case 10:
    case 5:
    case 3:
      do
      {
        do
        {
          do
            return i;
          while (!(paramObject instanceof Screen4));
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
        }
        while (!(paramObject instanceof Symbol));
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      }
      while (!(paramObject instanceof Symbol));
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 1:
    }
    paramCallContext.value1 = paramObject;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 1;
    return 0;
  }

  public int match2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    case 4:
    case 5:
    case 8:
    case 10:
    case 11:
    case 12:
    case 13:
    default:
      return super.match2(paramModuleMethod, paramObject1, paramObject2, paramCallContext);
    case 14:
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 9:
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 7:
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 6:
      if (!(paramObject1 instanceof Symbol))
        return -786431;
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 3:
      if (!(paramObject1 instanceof Symbol))
        return -786431;
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 2:
    }
    if (!(paramObject1 instanceof Symbol))
      return -786431;
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 2;
    return 0;
  }

  public int match4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default:
      return super.match4(paramModuleMethod, paramObject1, paramObject2, paramObject3, paramObject4, paramCallContext);
    case 13:
      if (!(paramObject1 instanceof Screen4))
        return -786431;
      paramCallContext.value1 = paramObject1;
      if (!(paramObject2 instanceof Component))
        return -786430;
      paramCallContext.value2 = paramObject2;
      if (!(paramObject3 instanceof String))
        return -786429;
      paramCallContext.value3 = paramObject3;
      if (!(paramObject4 instanceof String))
        return -786428;
      paramCallContext.value4 = paramObject4;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 4;
      return 0;
    case 8:
    }
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.value3 = paramObject3;
    paramCallContext.value4 = paramObject4;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 4;
    return 0;
  }
}

/* Location:           C:\Users\ANGELES\Desktop\BUAP\6_Primavera_2018\TEC_EMERGENTES\APP_FUNCIONAL\lobopark_dex2jar.jar
 * Qualified Name:     appinventor.ai_angeles02blue.lobopark.Screen4.frame
 * JD-Core Version:    0.6.2
 */