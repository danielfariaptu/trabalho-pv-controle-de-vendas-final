<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JDialogFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="2"/>
    <Property name="undecorated" type="boolean" value="true"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="true"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
    <AuxValue name="designerSize" type="java.awt.Dimension" value="-84,-19,0,5,115,114,0,18,106,97,118,97,46,97,119,116,46,68,105,109,101,110,115,105,111,110,65,-114,-39,-41,-84,95,68,20,2,0,2,73,0,6,104,101,105,103,104,116,73,0,5,119,105,100,116,104,120,112,0,0,1,-61,0,0,3,21"/>
  </AuxValues>

  <Layout class="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout">
    <Property name="useNullLayout" type="boolean" value="false"/>
  </Layout>
  <SubComponents>
    <Container class="javax.swing.JPanel" name="CadastroProduto">
      <Properties>
        <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="66" green="0" red="33" type="rgb"/>
        </Property>
      </Properties>
      <Events>
        <EventHandler event="componentShown" listener="java.awt.event.ComponentListener" parameters="java.awt.event.ComponentEvent" handler="CadastroProdutoComponentShown"/>
      </Events>
      <Constraints>
        <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
          <AbsoluteConstraints x="0" y="0" width="790" height="450"/>
        </Constraint>
      </Constraints>

      <Layout class="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout">
        <Property name="useNullLayout" type="boolean" value="false"/>
      </Layout>
      <SubComponents>
        <Component class="javax.swing.JLabel" name="jLabel1">
          <Properties>
            <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="0" green="0" red="0" type="rgb"/>
            </Property>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Rockwell" size="24" style="1"/>
            </Property>
            <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="ff" green="ff" red="ff" type="rgb"/>
            </Property>
            <Property name="text" type="java.lang.String" value="CADASTRO DE PRODUTO"/>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="300" y="10" width="350" height="43"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JTextField" name="tfNome">
          <Properties>
            <Property name="nextFocusableComponent" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfPreco"/>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="130" y="90" width="300" height="29"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JTextField" name="tfTipoUva">
          <Properties>
            <Property name="nextFocusableComponent" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfPaisOrigem"/>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="480" y="90" width="300" height="29"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JTextField" name="tfPreco">
          <Properties>
            <Property name="nextFocusableComponent" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfCodigoBarras"/>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="130" y="150" width="300" height="29"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JTextField" name="tfPaisOrigem">
          <Properties>
            <Property name="nextFocusableComponent" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfTipoVinho"/>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="480" y="150" width="300" height="29"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JTextField" name="tfCodigoBarras">
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="130" y="210" width="300" height="29"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JTextField" name="tfTipoVinho">
          <Properties>
            <Property name="nextFocusableComponent" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="btnConfirmar"/>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="480" y="210" width="300" height="29"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JLabel" name="lbNome">
          <Properties>
            <Property name="displayedMnemonic" type="int" value="110"/>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Tahoma" size="11" style="1"/>
            </Property>
            <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="ff" green="ff" red="ff" type="rgb"/>
            </Property>
            <Property name="labelFor" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="lbNome"/>
            </Property>
            <Property name="text" type="java.lang.String" value=" NOME:"/>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="130" y="70" width="-1" height="-1"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JLabel" name="lbTipoUva">
          <Properties>
            <Property name="displayedMnemonic" type="int" value="116"/>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Tahoma" size="11" style="1"/>
            </Property>
            <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="ff" green="ff" red="ff" type="rgb"/>
            </Property>
            <Property name="labelFor" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfTipoUva"/>
            </Property>
            <Property name="text" type="java.lang.String" value="TIPO DE UVA:"/>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="480" y="70" width="-1" height="20"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JLabel" name="lbPreco">
          <Properties>
            <Property name="displayedMnemonic" type="int" value="112"/>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Tahoma" size="11" style="1"/>
            </Property>
            <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="ff" green="ff" red="ff" type="rgb"/>
            </Property>
            <Property name="labelFor" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfPreco"/>
            </Property>
            <Property name="text" type="java.lang.String" value="PRE&#xc7;O:"/>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="130" y="130" width="-1" height="-1"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JLabel" name="lbPaisOrigem">
          <Properties>
            <Property name="displayedMnemonic" type="int" value="97"/>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Tahoma" size="11" style="1"/>
            </Property>
            <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="ff" green="ff" red="ff" type="rgb"/>
            </Property>
            <Property name="labelFor" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfPaisOrigem"/>
            </Property>
            <Property name="text" type="java.lang.String" value="PA&#xcd;S DE ORIGEM:"/>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="480" y="130" width="-1" height="-1"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JLabel" name="lbCodigoBarras">
          <Properties>
            <Property name="displayedMnemonic" type="int" value="99"/>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Tahoma" size="11" style="1"/>
            </Property>
            <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="ff" green="ff" red="ff" type="rgb"/>
            </Property>
            <Property name="labelFor" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfCodigoBarras"/>
            </Property>
            <Property name="text" type="java.lang.String" value="C&#xd3;DIGO DE BARRAS:"/>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="130" y="190" width="-1" height="-1"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JLabel" name="lbTipoVinho">
          <Properties>
            <Property name="displayedMnemonic" type="int" value="73"/>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Tahoma" size="11" style="1"/>
            </Property>
            <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="ff" green="ff" red="ff" type="rgb"/>
            </Property>
            <Property name="labelFor" type="java.awt.Component" editor="org.netbeans.modules.form.ComponentChooserEditor">
              <ComponentRef name="tfTipoVinho"/>
            </Property>
            <Property name="text" type="java.lang.String" value="TIPO DE VINHO:"/>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="480" y="190" width="-1" height="-1"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JButton" name="btnConfirmar">
          <Properties>
            <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="66" green="66" red="66" type="rgb"/>
            </Property>
            <Property name="icon" type="javax.swing.Icon" editor="org.netbeans.modules.form.editors2.IconEditor">
              <Image iconType="3" name="/trabalhoedwar/imagens/confirmar_1.png"/>
            </Property>
            <Property name="text" type="java.lang.String" value="Cadastro"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnConfirmarActionPerformed"/>
            <EventHandler event="keyPressed" listener="java.awt.event.KeyListener" parameters="java.awt.event.KeyEvent" handler="btnConfirmarKeyPressed"/>
          </Events>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="190" y="310" width="140" height="60"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JButton" name="btnCancelar">
          <Properties>
            <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="66" green="66" red="66" type="rgb"/>
            </Property>
            <Property name="icon" type="javax.swing.Icon" editor="org.netbeans.modules.form.editors2.IconEditor">
              <Image iconType="3" name="/trabalhoedwar/imagens/excluir.png"/>
            </Property>
            <Property name="text" type="java.lang.String" value="Fechar"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnCancelarActionPerformed"/>
          </Events>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="340" y="310" width="140" height="60"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JLabel" name="lbAviso">
          <Properties>
            <Property name="text" type="java.lang.String" value="Os campos marcados com * s&#xe3;o obrigat&#xf3;rios."/>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="130" y="420" width="-1" height="-1"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JButton" name="btnLimpar">
          <Properties>
            <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="66" green="66" red="66" type="rgb"/>
            </Property>
            <Property name="text" type="java.lang.String" value="Limpar"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnLimparActionPerformed"/>
            <EventHandler event="keyPressed" listener="java.awt.event.KeyListener" parameters="java.awt.event.KeyEvent" handler="btnLimparKeyPressed"/>
          </Events>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="640" y="310" width="140" height="60"/>
            </Constraint>
          </Constraints>
        </Component>
        <Component class="javax.swing.JButton" name="btnNovo">
          <Properties>
            <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="66" green="66" red="66" type="rgb"/>
            </Property>
            <Property name="text" type="java.lang.String" value="Novo"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnNovoActionPerformed"/>
            <EventHandler event="keyTyped" listener="java.awt.event.KeyListener" parameters="java.awt.event.KeyEvent" handler="btnNovoKeyTyped"/>
          </Events>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="490" y="310" width="140" height="60"/>
            </Constraint>
          </Constraints>
        </Component>
      </SubComponents>
    </Container>
  </SubComponents>
</Form>
