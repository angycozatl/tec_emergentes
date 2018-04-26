package appinventor.ai_angeles02blue.lobopark;

import com.google.appinventor.components.runtime.Component;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleMethod;
import gnu.mapping.CallContext;
import gnu.mapping.Symbol;
import gnu.mapping.Values;

public class Screen1$frame extends ModuleBody
{
  Screen1 $main;

  public Object apply0(ModuleMethod paramModuleMethod)
  {
    switch (paramModuleMethod.selector)
    {
    default:
      return super.apply0(paramModuleMethod);
    case 15:
      return Screen1.lambda2();
    case 16:
      this.$main.$define();
      return Values.empty;
    case 17:
      return Screen1.lambda3();
    case 18:
      return Screen1.lambda4();
    case 19:
      return Screen1.lambda5();
    case 20:
      return Screen1.lambda6();
    case 21:
      return Screen1.lambda7();
    case 22:
      return Screen1.lambda8();
    case 23:
      return this.$main.BotonMENU$Click();
    case 24:
      return Screen1.lambda9();
    case 25:
      return Screen1.lambda10();
    case 26:
      return Screen1.lambda11();
    case 27:
      return Screen1.lambda12();
    case 28:
      return Screen1.lambda13();
    case 29:
      return Screen1.lambda14();
    case 30:
      return Screen1.lambda15();
    case 31:
      return Screen1.lambda16();
    case 32:
      return Screen1.lambda17();
    case 33:
      return Screen1.lambda18();
    case 34:
      return this.$main.Botón1$Click();
    case 35:
      return Screen1.lambda19();
    case 36:
      return Screen1.lambda20();
    case 37:
      return this.$main.Botón2$Click();
    case 38:
      return Screen1.lambda21();
    case 39:
      return Screen1.lambda22();
    case 40:
      return Screen1.lambda23();
    case 41:
      return Screen1.lambda24();
    case 42:
      return Screen1.lambda25();
    case 43:
      return Screen1.lambda26();
    case 44:
    }
    return this.$main.Reloj1$Timer();
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
    //   71: invokespecial 128	gnu/expr/ModuleBody:apply1	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;)Ljava/lang/Object;
    //   74: areturn
    //   75: aload_0
    //   76: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   79: aload_2
    //   80: invokevirtual 132	appinventor/ai_angeles02blue/lobopark/Screen1:androidLogForm	(Ljava/lang/Object;)V
    //   83: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   86: areturn
    //   87: aload_0
    //   88: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   91: astore 6
    //   93: aload_2
    //   94: checkcast 134	gnu/mapping/Symbol
    //   97: astore 8
    //   99: aload 6
    //   101: aload 8
    //   103: invokevirtual 138	appinventor/ai_angeles02blue/lobopark/Screen1:lookupInFormEnvironment	(Lgnu/mapping/Symbol;)Ljava/lang/Object;
    //   106: areturn
    //   107: aload_0
    //   108: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   111: astore_3
    //   112: aload_2
    //   113: checkcast 134	gnu/mapping/Symbol
    //   116: astore 5
    //   118: aload_3
    //   119: aload 5
    //   121: invokevirtual 142	appinventor/ai_angeles02blue/lobopark/Screen1:isBoundInFormEnvironment	(Lgnu/mapping/Symbol;)Z
    //   124: ifeq +7 -> 131
    //   127: getstatic 148	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   130: areturn
    //   131: getstatic 151	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   134: areturn
    //   135: aload_0
    //   136: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   139: aload_2
    //   140: invokevirtual 154	appinventor/ai_angeles02blue/lobopark/Screen1:addToFormDoAfterCreation	(Ljava/lang/Object;)V
    //   143: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   146: areturn
    //   147: aload_0
    //   148: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   151: aload_2
    //   152: invokevirtual 157	appinventor/ai_angeles02blue/lobopark/Screen1:sendError	(Ljava/lang/Object;)V
    //   155: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   158: areturn
    //   159: aload_0
    //   160: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   163: aload_2
    //   164: invokevirtual 160	appinventor/ai_angeles02blue/lobopark/Screen1:processException	(Ljava/lang/Object;)V
    //   167: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   170: areturn
    //   171: astore 7
    //   173: new 162	gnu/mapping/WrongType
    //   176: dup
    //   177: aload 7
    //   179: ldc 164
    //   181: iconst_1
    //   182: aload_2
    //   183: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   186: athrow
    //   187: astore 4
    //   189: new 162	gnu/mapping/WrongType
    //   192: dup
    //   193: aload 4
    //   195: ldc 169
    //   197: iconst_1
    //   198: aload_2
    //   199: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
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
    //   76: invokespecial 173	gnu/expr/ModuleBody:apply2	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   79: areturn
    //   80: aload_0
    //   81: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   84: astore 10
    //   86: aload_2
    //   87: checkcast 134	gnu/mapping/Symbol
    //   90: astore 12
    //   92: aload 10
    //   94: aload 12
    //   96: aload_3
    //   97: invokevirtual 177	appinventor/ai_angeles02blue/lobopark/Screen1:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   100: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   103: areturn
    //   104: aload_0
    //   105: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   108: astore 7
    //   110: aload_2
    //   111: checkcast 134	gnu/mapping/Symbol
    //   114: astore 9
    //   116: aload 7
    //   118: aload 9
    //   120: aload_3
    //   121: invokevirtual 180	appinventor/ai_angeles02blue/lobopark/Screen1:lookupInFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   124: areturn
    //   125: aload_0
    //   126: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   129: astore 4
    //   131: aload_2
    //   132: checkcast 134	gnu/mapping/Symbol
    //   135: astore 6
    //   137: aload 4
    //   139: aload 6
    //   141: aload_3
    //   142: invokevirtual 183	appinventor/ai_angeles02blue/lobopark/Screen1:addToGlobalVarEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   145: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   148: areturn
    //   149: aload_0
    //   150: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   153: aload_2
    //   154: aload_3
    //   155: invokevirtual 187	appinventor/ai_angeles02blue/lobopark/Screen1:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   158: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   161: areturn
    //   162: aload_0
    //   163: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   166: aload_2
    //   167: aload_3
    //   168: invokevirtual 190	appinventor/ai_angeles02blue/lobopark/Screen1:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   171: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   174: areturn
    //   175: aload_0
    //   176: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   179: aload_2
    //   180: aload_3
    //   181: invokevirtual 194	appinventor/ai_angeles02blue/lobopark/Screen1:lookupHandler	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   184: areturn
    //   185: astore 11
    //   187: new 162	gnu/mapping/WrongType
    //   190: dup
    //   191: aload 11
    //   193: ldc 196
    //   195: iconst_1
    //   196: aload_2
    //   197: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   200: athrow
    //   201: astore 8
    //   203: new 162	gnu/mapping/WrongType
    //   206: dup
    //   207: aload 8
    //   209: ldc 164
    //   211: iconst_1
    //   212: aload_2
    //   213: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   216: athrow
    //   217: astore 5
    //   219: new 162	gnu/mapping/WrongType
    //   222: dup
    //   223: aload 5
    //   225: ldc 198
    //   227: iconst_1
    //   228: aload_2
    //   229: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   232: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   86	92	185	java/lang/ClassCastException
    //   110	116	201	java/lang/ClassCastException
    //   131	137	217	java/lang/ClassCastException
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
    //   40: invokespecial 202	gnu/expr/ModuleBody:apply4	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: areturn
    //   44: aload_0
    //   45: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   48: aload_2
    //   49: aload_3
    //   50: aload 4
    //   52: aload 5
    //   54: invokevirtual 206	appinventor/ai_angeles02blue/lobopark/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   57: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   60: areturn
    //   61: aload_0
    //   62: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen1$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen1;
    //   65: astore 6
    //   67: aload_2
    //   68: checkcast 208	com/google/appinventor/components/runtime/Component
    //   71: astore 8
    //   73: aload_3
    //   74: checkcast 210	java/lang/String
    //   77: astore 10
    //   79: aload 4
    //   81: checkcast 210	java/lang/String
    //   84: astore 12
    //   86: aload 5
    //   88: checkcast 212	[Ljava/lang/Object;
    //   91: astore 14
    //   93: aload 6
    //   95: aload 8
    //   97: aload 10
    //   99: aload 12
    //   101: aload 14
    //   103: invokevirtual 216	appinventor/ai_angeles02blue/lobopark/Screen1:dispatchEvent	(Lcom/google/appinventor/components/runtime/Component;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Z
    //   106: ifeq +7 -> 113
    //   109: getstatic 148	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   112: areturn
    //   113: getstatic 151	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   116: areturn
    //   117: astore 7
    //   119: new 162	gnu/mapping/WrongType
    //   122: dup
    //   123: aload 7
    //   125: ldc 217
    //   127: iconst_1
    //   128: aload_2
    //   129: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   132: athrow
    //   133: astore 9
    //   135: new 162	gnu/mapping/WrongType
    //   138: dup
    //   139: aload 9
    //   141: ldc 217
    //   143: iconst_2
    //   144: aload_3
    //   145: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   148: athrow
    //   149: astore 11
    //   151: new 162	gnu/mapping/WrongType
    //   154: dup
    //   155: aload 11
    //   157: ldc 217
    //   159: iconst_3
    //   160: aload 4
    //   162: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   165: athrow
    //   166: astore 13
    //   168: new 162	gnu/mapping/WrongType
    //   171: dup
    //   172: aload 13
    //   174: ldc 217
    //   176: iconst_4
    //   177: aload 5
    //   179: invokespecial 167	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   182: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   67	73	117	java/lang/ClassCastException
    //   73	79	133	java/lang/ClassCastException
    //   79	86	149	java/lang/ClassCastException
    //   86	93	166	java/lang/ClassCastException
  }

  public int match0(ModuleMethod paramModuleMethod, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default:
      return super.match0(paramModuleMethod, paramCallContext);
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
          while (!(paramObject instanceof Screen1));
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
      if (!(paramObject1 instanceof Screen1))
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
 * Qualified Name:     appinventor.ai_angeles02blue.lobopark.Screen1.frame
 * JD-Core Version:    0.6.2
 */